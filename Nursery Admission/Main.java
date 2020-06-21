#include<iostream>
#include<string.h>;
using namespace std;
int main()
{
   char str[50];
  gets(str);
  cout<<"The number of letters in the name is "<<strlen(str);
}