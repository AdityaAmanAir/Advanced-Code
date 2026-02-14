#include <iostream>
#include <Eigen/Dense> // The main Eigen header

int main() {
    Eigen::MatrixXd m(2, 2); // Create a 2x2 dynamic matrix
    m << 1, 2,
         3, 4;
    std::cout << "My first Eigen matrix:\n" << m << std::endl;
    return 0;
}