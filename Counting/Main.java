#include<iostream>
#include<string.h>
using namespace std;
void countCharacterType(string str) 
{ 
    // Declare the variable vowels, consonant, digit 
    // and special characters 
    int vowels = 0, consonant = 0, specialChar = 0,  
        digit = 0,symbols=0; 
  
    // str.length() function to count number of 
    // character in given string. 
    for (int i = 0; i < str.length(); i++) { 
           
        char ch = str[i]; 
  
        if ( (ch >= 'a' && ch <= 'z') ||  
              (ch >= 'A' && ch <= 'Z') ) { 
  
            // To handle upper case letters 
            ch = tolower(ch); 
  
            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u') 
                vowels++; 
            else
                consonant++; 
        } 
        else if (ch >= '0' && ch <= '9') 
            digit++; 
        else if(ch==' ')
            specialChar++; 
        else
          symbols++;
    } 
    cout << "Vowels:" << vowels << endl; 
    cout << "Consonants:" << consonant << endl; 
   
    cout << "White Spaces:" << specialChar << endl;
   cout << "Digits:" << digit << endl;
   cout << "Symbols:" << symbols << endl; 
} 
  
// Driver function. 
int main() 
{ 
    string str; 
    getline(cin,str);
    countCharacterType(str); 
    return 0; 
} 