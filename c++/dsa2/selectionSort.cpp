#include<iostream>
#include<vector>
using namespace std;
int main(){
vector <int> vec={1,2,5,4,10,16,24,14,0};
int n=size(vec);
for(int i=0;i<n;i++){
int minn=i;
    for(int j=i;j<n;j++){
        if(vec[j]>vec[minn]){
            minn=j;
        }
    }swap(vec[i], vec[minn]);
}
for(int i:vec){
        cout<<i<<" ";
    }
    return 0;
}