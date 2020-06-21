#include<iostream>
using namespace std;
int main()
{
  int m,n,req,B;
  cin>>m>>n>>req;
  B=m*m*m;
  if(B>=req)
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else
  {
    cout<<"Sorry Doctor! You need more bacteria.";
  }
  return 0;
}
    