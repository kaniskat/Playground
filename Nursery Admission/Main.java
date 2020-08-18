#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char a[50];
  int size;
  cin.getline(a,100);
  size=strlen(a);
  cout<<"The number of letters in the name is "<<size;
}