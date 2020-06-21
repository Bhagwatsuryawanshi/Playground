#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fs,sa,sd,ss,aa,ad,as,p1,p2,p3;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  p1=(fa-(fd*fa)/100)+fs;
  p2=(sa-(sd*sa)/100)+ss;
  p3=(aa-(ad*aa)/100)+as;
  cout<<"In Flipkart Rs."<<p1<<endl;
  cout<<"In Snapdeal Rs."<<p2<<endl;
  cout<<"In Amazon Rs."<<p3<<endl;
if(p1<p2 && p1<p3)
   {
   cout<<"He will prefer Flipkart";
   }
   else if (p2<p1 && p2<p3)
   {
      cout<<"He will prefer Snapdeal";
   }
   else if(p3<p1 && p3<p2)
   {
        cout<<"He will prefer Amazon";
   }
else if(p1==p2)
   {
     if (fd>sd)
        cout<<"He will prefer Flipkart";
     else
          cout<<"He will prefer Snapdeal";
   }
   else if(p2==p3)
   {
     if (sd>ad)
        cout<<"He will prefer Snapdeal";
     else
          cout<<"He will prefer Amazon";
   }
   else if(p1==p3)
   {
     if (ad>fd)
        cout<<"He will prefer Amazon";
     else
          cout<<"He will prefer Flipkart";
   }
else
   {
     cout<<"invalid";
   }
   
 }