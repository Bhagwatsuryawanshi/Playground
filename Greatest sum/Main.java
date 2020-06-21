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
   cout<<"Sum of rows is ";
  for(row=0;row<r;row++)
  {
    sum=0;
      for(col=0;col<c;col++)
  {
    sum+=a[row][col];
  }
  cout<<sum<<" ";
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
  cout<<"\nRow "<<row_ind+1<<" has maximum sum ";
  cout<<"\nSum of columns is ";
  sum=0;
  int y=0;
  int col_arr[c];
  for(i=0;i<c;i++)
  {
    sum=0;
    for(j=0;j<r;++j)
    {
      sum+=a[j][i];
    }
    cout<<sum<<" ";
    col_arr[y++]=sum;
  }
  int temp_col=col_arr[0];
  for(i=1;i<c;i++)
  {
    if(temp_col<col_arr[i])
    {
      temp_col=col_arr[i];
      col_ind=i;
    }
  }
  cout<<"\nColumn "<<col_ind+1<<" has maximum sum ";
  return 0;
}