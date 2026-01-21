#include <opencv2/opencv.hpp>
#include <opencv2/imgproc.hpp>
#include <iostream>
#include <vector>

using namespace cv;
using namespace std;

int main() {
    // Open webcam
    VideoCapture cap(0);
    
    if (!cap.isOpened()) {
        cout << "Error: Could not open camera!" << endl;
        return -1;
    }
    
    cout << "Hand Gesture Detection Started!" << endl;
    cout << "Instructions:" << endl;
    cout << "1. Show your hand to the camera" << endl;
    cout << "2. Make sure lighting is good" << endl;
    cout << "3. Use plain background for best results" << endl;
    cout << "4. Press 'q' to quit" << endl;
    cout << "5. Press 'c' to calibrate skin color" << endl;
    
    // Variables for skin color calibration
    bool calibrate = false;
    Rect calibrationROI(300, 200, 100, 100);
    Scalar lower_skin = Scalar(0, 20, 70);
    Scalar upper_skin = Scalar(20, 255, 255);
    
    while (true) {
        Mat frame, hsv, mask, output;
        
        // Capture frame
        cap >> frame;
        if (frame.empty()) {
            cout << "Error: Empty frame!" << endl;
            break;
        }
        
        // Flip for mirror effect
        flip(frame, frame, 1);
        
        // Create output display
        output = frame.clone();
        
        // Draw calibration ROI
        rectangle(output, calibrationROI, Scalar(255, 0, 0), 2);
        
        // Convert to HSV
        cvtColor(frame, hsv, COLOR_BGR2HSV);
        
        // Calibration mode
        if (calibrate) {
            Mat roi = hsv(calibrationROI);
            
            // Calculate mean HSV values from ROI
            Scalar meanHSV = mean(roi);
            
            // Set skin color range based on calibration
            lower_skin = Scalar(max(0.0, meanHSV[0] - 10), 
                               max(0.0, meanHSV[1] - 40), 
                               max(0.0, meanHSV[2] - 40));
            upper_skin = Scalar(min(180.0, meanHSV[0] + 10), 
                               min(255.0, meanHSV[1] + 40), 
                               min(255.0, meanHSV[2] + 40));
            
            putText(output, "Calibration Complete!", Point(10, 150), 
                    FONT_HERSHEY_SIMPLEX, 0.7, Scalar(0, 255, 0), 2);
            calibrate = false;
        }
        
        // Create skin mask
        inRange(hsv, lower_skin, upper_skin, mask);
        
        // Clean up mask
        Mat kernel = getStructuringElement(MORPH_ELLIPSE, Size(5, 5));
        morphologyEx(mask, mask, MORPH_OPEN, kernel);
        morphologyEx(mask, mask, MORPH_CLOSE, kernel);
        
        // Find contours
        vector<vector<Point>> contours;
        vector<Vec4i> hierarchy;
        findContours(mask, contours, hierarchy, RETR_EXTERNAL, CHAIN_APPROX_SIMPLE);
        
        // Find largest contour (hand)
        if (!contours.empty()) {
            int largestIdx = 0;
            double maxArea = 0;
            for (size_t i = 0; i < contours.size(); i++) {
                double area = contourArea(contours[i]);
                if (area > maxArea) {
                    maxArea = area;
                    largestIdx = i;
                }
            }
            
            // Only process if area is significant
            if (maxArea > 5000) {
                // Draw contour
                drawContours(output, contours, largestIdx, Scalar(0, 255, 0), 3);
                
                // Get bounding rectangle
                Rect boundRect = boundingRect(contours[largestIdx]);
                rectangle(output, boundRect, Scalar(255, 0, 0), 2);
                
                // Calculate center
                Point center(boundRect.x + boundRect.width/2, 
                           boundRect.y + boundRect.height/2);
                circle(output, center, 10, Scalar(0, 0, 255), -1);
                
                // Simple finger count based on contour shape
                vector<Point> hull;
                convexHull(contours[largestIdx], hull);
                
                // Approximate the contour
                vector<Point> approx;
                double epsilon = 0.02 * arcLength(contours[largestIdx], true);
                approxPolyDP(contours[largestIdx], approx, epsilon, true);
                
                // Determine gesture based on shape
                string gesture = "Unknown";
                
                if (hull.size() > 2) {
                    double hullArea = contourArea(hull);
                    double contourAreaValue = contourArea(contours[largestIdx]);
                    double solidity = contourAreaValue / hullArea;
                    
                    // Calculate extent (ratio of contour area to bounding rectangle area)
                    double rectArea = boundRect.width * boundRect.height;
                    double extent = contourAreaValue / rectArea;
                    
                    // Simple gesture recognition
                    if (extent > 0.6 && solidity > 0.8) {
                        gesture = "Fist";
                    } else if (extent > 0.3 && extent < 0.6) {
                        // Count convexity defects for fingers
                        vector<int> hullIndices;
                        vector<Vec4i> defects;
                        convexHull(contours[largestIdx], hullIndices);
                        
                        if (hullIndices.size() > 3) {
                            convexityDefects(contours[largestIdx], hullIndices, defects);
                            
                            int fingerCount = 0;
                            for (size_t i = 0; i < defects.size(); i++) {
                                float depth = defects[i][3] / 256.0;
                                if (depth > 10.0) { // Threshold for finger valleys
                                    fingerCount++;
                                }
                            }
                            
                            fingerCount = min(fingerCount + 1, 5); // Max 5 fingers
                            gesture = "Fingers: " + to_string(fingerCount);
                        }
                    }
                }
                
                // Display gesture
                putText(output, "Gesture: " + gesture, Point(10, 50), 
                        FONT_HERSHEY_SIMPLEX, 1.2, Scalar(0, 255, 255), 3);
            }
        }
        
        // Display instructions
        putText(output, "Place hand in blue box & press 'c' to calibrate", 
                Point(10, 100), FONT_HERSHEY_SIMPLEX, 0.6, Scalar(255, 255, 255), 2);
        putText(output, "Press 'q' to quit", Point(10, 130), 
                FONT_HERSHEY_SIMPLEX, 0.6, Scalar(255, 255, 255), 2);
        
        // Show skin mask
        Mat maskBGR;
        cvtColor(mask, maskBGR, COLOR_GRAY2BGR);
        
        // Combine original and mask
        Mat combined;
        hconcat(output, maskBGR, combined);
        
        imshow("Hand Gesture Detection - Original | Skin Mask", combined);
        
        // Handle key presses
        char key = waitKey(1);
        if (key == 'q') {
            break;
        } else if (key == 'c') {
            calibrate = true;
            cout << "Calibrating skin color..." << endl;
        }
    }
    
    cap.release();
    destroyAllWindows();
    
    return 0;
}
