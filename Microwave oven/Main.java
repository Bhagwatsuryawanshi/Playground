#include<iostream>
using namespace std;
int main()
{
  float n,sht,rht;
  cin>>n>>sht;
  if(n==2)
  {
    rht=sht+(sht*50)/100;
    cout<<rht;
  }
  else if(n==3)
  {
    rht=sht*2;
    cout<<rht;
  }
  else
  {
    cout<<"Number of items is more";
  }
}