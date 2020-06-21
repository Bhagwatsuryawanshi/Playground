#include<iostream>
using namespace std;
int main()
{
    int n,target,sum=0,c=0;
    cin>>target;
    while(1)
    {
   cin>>n;
        sum+=n;
        c++;
        if(sum>=target)
            break;
    }
    cout<<"The number of turns is "<<c;
 return 0;
}