#include<iostream>
using namespace std;
int main()
{
  int n,B;
  cin>>n;
  if(n<=200)
  { 
    B=n*(0.5);
    cout<<"Rs."<<B;
  }
  else if(n<=400)
  {
    B=(n*(0.65))+100;
    cout<<"Rs."<<B;
  }
       else if(n<=600)
       {
         B=(n*(0.80))+200;
        cout<<"Rs."<<B;
       }
         else if(n>600)
            {
              B=(n*(1.25))+425;
           cout<<"Rs."<<B;
             }
    else
                 { cout <<"invalid input"; 
                 }
}