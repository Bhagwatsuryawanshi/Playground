#include<iostream>
using namespace std;
int queue(int n,int m,int a[])
{
  int s=0;
  for(int i=0;i<n;i++)
  {
    s+=a[i];}
    if(n==1 && m==2)
      return 1;
    else
      return(s/m)+1;
}
int main()
{
  //Type your code here.
  int m,n;
  cin>>n>>m;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];}
  cout<<queue(n,m,a);
}