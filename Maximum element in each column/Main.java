#include<iostream>
using namespace std;
int main()
{
  int m,n,i,j;
  cin>>m>>n;
  int arr[m][n];
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>arr[i][j];
    }
  }
   for(i=0;i<n;i++)
  {
     int max=arr[0][i];
    for(j=1;j<m;j++)
    {
      if(arr[j][i]>max)
      {
        max=arr[j][i];
      }
    }
     cout<<max<<"\n";
   }
}