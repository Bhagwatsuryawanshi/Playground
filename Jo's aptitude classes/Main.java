#include<iostream>
using namespace std;
int gcd(int m,int n)
{
        int rem;
        while(n>=1)
        {
                rem=m%n;
                m=n;
                n=rem;
        }
        return(m);
}
int main()
{
        int num1,num2,num3,gcd1,gcd2,op;
         cin>>num1>>num2>>num3>>op;
        gcd1=gcd(num1,num2);
        gcd2=gcd(num3,gcd1);

if(op==gcd2)
  { cout<<"Answer is correct.";}
  else 
  {  cout<<"Answer is wrong.";}
  
        return 0;
}