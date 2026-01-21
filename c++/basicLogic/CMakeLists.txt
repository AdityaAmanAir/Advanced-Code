cmake_minimum_required(VERSION 3.10)
project(SimpleHandGesture)

set(CMAKE_CXX_STANDARD 11)

# Find OpenCV
find_package(OpenCV REQUIRED)

# Include directories
include_directories(${OpenCV_INCLUDE_DIRS})

# Create executable
add_executable(simple_hand_gesture simple_hand_gesture.cpp)

# Link OpenCV libraries
target_link_libraries(simple_hand_gesture ${OpenCV_LIBS})