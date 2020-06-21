#include <iostream>
using namespace std;
int main()
{
  int a,b,x,c;
  cout<<"Enter first number :"<<" Enter second number :"<<" Menu"<<endl;
  cout<<"1.Addition"<<endl<<"2.Subtraction"<<endl<<"3.Multiplication"<<endl
    <<"4.Division"<<endl<<"5.Remainder"<<endl;
  cin>>a>>b>>x;
  switch(x)
  {
   case 1:  a+b;
      cout<<a+b;
  break;
  case 2:  c=a-b;
      cout<<c;
  break;
  case 3:  c= a*b;
      cout<<c;
  break;
  case 4:    c=a/b;
      cout<<c;
  break;
  case 5:   c= a%b;
      cout<<c;
  break;
    default: cout<<"Invalid operation";
      break;
  }
  return 0;
}
  