#include <iostream>
#include<cmath>
using namespace std;
int main(){
    cout<<(((numeric_limits<float>::quiet_NaN()) >= (numeric_limits<float>::infinity()))?"True":"False");
    return 0;
}