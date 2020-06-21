#include<iostream>
using namespace std;

int EO(int n,int a[])
{
  int e=0,o=0;
for(int i=0;i<n;i++)
 {
     if(a[i]%2==0)
     { e=e+a[i];
     }
     else
     {o=o+a[i];}

  }cout<<"The sum of the even numbers in the array is "<<e<<endl;
       cout<<"The sum of the odd numbers in the array is "<<o;
}
int main()
{
int n;
  cin>>n;
  int a[n];
 for(int i=0;i<n;i++)
 {
   cin>>a[i];
 }
  EO(n,a);
  
}