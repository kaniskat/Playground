#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char a[50][50];
  int i,n=0;
  for(i=0;i<6;i++)
  {
    gets(a[i]);
    n++;
    if(!strcmp(a[i],"####"))
    break;
   }
  cout<<a[0]<<"\n";
    for(i=0;i<n;i++)
       {
         if(a[i][strlen(a[i])-1]==a[i+1][0])
         {
           cout<<a[i+1]<<"\n";
         }
       }
       }
  