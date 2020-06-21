#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,i,count=0;
  cin>>n;
  n=n/10;
  while(n>0)
  {
    count ++;
    n=n/10;
  }
  cout<<count+1;
    return 0;
}