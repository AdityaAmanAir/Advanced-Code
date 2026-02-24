#include <iostream>
#include <cstdlib>

int main() {
    std::cout << "Requesting system shutdown..." << std::endl;
    
    // In Linux, 'now' triggers immediately. 
    // You can change 'now' to '+5' for a 5-minute delay.
    system("shutdown -h now");

    return 0;
}
