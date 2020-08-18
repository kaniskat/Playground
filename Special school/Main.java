#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char a[50],b[50],rev[50],temp;
  int i,j;
  gets(a);
  gets(b);
   j=strlen(a)-1;
   for(i=0;i<j;i++,j--)
   {
     temp=a[i];
     a[i]=a[j];
     a[j]=temp;
   }
  if(strcmp(a,b)==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";   
}