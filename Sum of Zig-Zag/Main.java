#include<iostream>
using namespace std;
int main()
{
  int m,n,sum=0,row1=0,col_n=0,diag=0;
  cin>>m>>n;
  int a[m][n];
  int i,j;
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }
  
  for(i=0;i<=0;i++)
  {
    for(j=0;j<n-1;j++)
    {
      row1+=a[i][j];
    }
  }
  
  for(j=n-1;j==n-1;j--)
  {
    for(i=1;i<m;i++)
    {
      col_n+=a[j][i];
    }
  }
  
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      if((i+j)==(m-1))
      {
        diag+=a[i][j];
      }
    }
  }
  cout<<"Sum of Zig-Zag pattern is "<<row1+col_n+diag;
}