#include <iostream>
#include<string.h>
using namespace std;
int main()
{
char str[100], rev[100];     
int count = 0, end, i,j; 
  cin.getline(str,100);
  j=strlen(str)-1;
  for(i=0;i<100;i++,j--)
  {
    rev[i]=str[j];   
  }
             
std::cout<<rev;
}