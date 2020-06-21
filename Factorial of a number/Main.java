#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n,i,f=1;
  cin>>n;
  for(int i=1;i<=n;++i)
    f=f*i;
  cout<<f;
}