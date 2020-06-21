#include <cstring>
#include <iostream>
using namespace std;
int main()
{
   //Your code goes here
  char str[100];
 cin.getline(str,100);
 int L=strlen(str);
  int word=0;
  for(int i=0;i<L;i++)
  {
  if(str[i]==' ')
    word++;
  }
  
  if(word<=10)
    cout<<"Caption eligible for the contest"<<endl;
  else
    cout<<"Caption not eligible for the contest";
   return 0;
}