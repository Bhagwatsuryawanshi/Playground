#include<iostream>
using namespace std;
void swap (int &num1, int &num2) //&num1 and &bnum2 are Reference variables
{
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
}
int main()
{
        int a,b;
        cin>>a>>b;
        cout<<"Before swapping"<<" a= "<<a<<" and b="<<b<<endl;
        swap(a,b);
        cout<<"After swapping"<<" a= "<<a<<" and b="<<b;
        return 0;
}

