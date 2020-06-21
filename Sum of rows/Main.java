#include<iostream>
using namespace std;
int main()
{
int r,c,i,j,row,col,row_ind=0,col_ind=0,sum=0;
  int row_arr[r];
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  int z = 0;
  for(row=0;row<r;row++)
  {
    sum=0;
      for(col=0;col<c;col++)
  {
    sum+=a[row][col];
  }
  cout<<sum<<"\n";
  row_arr[z++]=sum;
  }
  int temp_row=row_arr[0];
  for(i=1;i<r;i++)
  {
    if(temp_row<row_arr[i])
    {
      temp_row=row_arr[i];
      row_ind=i;
    }
  }
}