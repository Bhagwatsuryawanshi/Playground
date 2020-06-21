#include<iostream>
using namespace std;
int main()
{
int n,number,i;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cin>>number;
 bool check = false;

for (int i = 0; i < n; i++)
{
    if(number == a[i])
    {
        cout<<"She passed her exam"<<endl;
        check = true;
        break;
    }
}

if (!check)
    cout<<"She failed"<<endl;
}