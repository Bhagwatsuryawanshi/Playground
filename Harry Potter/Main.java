#include<iostream>
using namespace std;
int main()
{
  int x,up,thp,code;
  cin>>x;
  up=x%10;
  thp=x/1000;
code=up+thp;
  cout<<code;
  return 0;
}