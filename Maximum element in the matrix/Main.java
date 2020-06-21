#include<iostream>
using namespace std;
int main()
{
  int m,n,i,j=0,max;
  cin>>m>>n;
  int arr[m][n];
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>arr[i][j];
    }
  }
   max=arr[0][0];
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      if(max<arr[i][j])
      {
        max=arr[i][j];
      }
    }
  }
   cout<<"The maximum element is "<<max;
  return 0;
}