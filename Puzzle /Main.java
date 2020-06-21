#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,aux;
  cin>>r>>c;;
  int  a[r][c];
  int b[r][c];
   for(i=0;i<r;i++)
   {
     for(j=0;j<c;j++)
     {
       cin>>a[i][j];
     }
   }
//Change
for(i=0;i<c;i++)
{
    for(j=0;j<r;j++)
    {
          cout<<a[j][i]<<" ";
            b[i][j]=a[j][i];
    }cout<<endl;
}
}


