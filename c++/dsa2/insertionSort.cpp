#include<iostream>
#include<vector>
using namespace std;
void backbubble(vector<int>&vec,int i)  {
    for(int j=i;j>0;j--){
        if(vec[j]>vec[j-1]){
            swap(vec[j],vec[j-1]);
        }
    }
}
int main(){
    vector<int> vec={1,2,5,4,10,16,24,14,0};
    int n=vec.size();
    for(int i=1;i<n;i++){
        if(vec[i]>vec[i-1]){
            backbubble(vec,i);
        }
    }
for(int i:vec){
        cout<<i<<" ";
    }

    return 0;
}