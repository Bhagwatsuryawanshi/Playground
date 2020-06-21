#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
 int n,s,i;
  cin>>n>>s;
  int mugs[n];
  for(i=0;i<n;i++)
  {
    cin>>mugs[i];
  }
    int t=0;
  for(i=0;i<n;i++)
  {
    t=t+mugs[i];
  }
    if(t<=s)
    {
  cout<<"YES";
    }
    else 
    {
      cout<<"NO";
    }
}
    