#include<iostream>
#include<vector>
using namespace std;
int main(){
    vector<int> vec={1,2,5,4,10,16,24,14,0};
    int n=vec.size();
    for (int i=0; i<n;i++){
        bool isswap=false;
        for(int j=0;j<n-i-1;j++){
            if(vec[j]>vec[j+1]){ // chang comp op to change order
                swap(vec[j], vec[j+1]);
                isswap=true;
            }
        }if(isswap==false){
            break;
        }
        
    }
    for(int i:vec){
        cout<<i<<" ";
    }

    return 0;
}