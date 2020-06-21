#include<iostream>
using namespace std;
int main()
{
  float M;
  int P,d,D;
  cin>>M>>P>>d;
  D=M*P;
  if (d<D)
  {
    cout<<"Can reach";
  }
  else
  {
    cout<<"Cannot reach";
  }
  return 0;
}