#include<iostream>
using namespace std;
int main()
{
  int B,A,C,Aw=75,Cw=30,w;
  cin>>B>>A>>C;
  w=(A*Aw)+(C*Cw);
  if(w<=B)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
  return 0;
}