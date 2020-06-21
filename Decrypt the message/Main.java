#include <iostream>
using namespace std;
int main()
{
  int n,t,i=1,sum=0,no;
  cin>>n>>t;
  no=n+t;
  while(i<no)
  {
    if(no%i==0)
      sum=sum+i;
    i++;
  }
  if(no==sum)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
return 0;
}