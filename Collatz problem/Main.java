// ? 2017 TheFlyingKeyboard and released under MIT License
// theflyingkeyboard.net

#include <iostream>

using namespace std;

unsigned long long collatzConjecture(unsigned long long num);

int main(){
  unsigned long long number;
  unsigned long long iterNum = 0;
  
  cin >> number;
  
  cout << number <<endl;
  
  while(number != 1 ){
    number = collatzConjecture(number);
    cout << number <<endl;
    
    iterNum++;
  }
  cout<<iterNum;
  
  return 0;
}

unsigned long long collatzConjecture(unsigned long long num){
  if(num % 2 == 0){
    return num / 2;
  }else{
    return 3 * num + 1;
  }
}