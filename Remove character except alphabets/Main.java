#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char a[200],i,j;
  gets(a);
  j=strlen(a);
  for(i=0;i<j;i++)
  {
   if(a[i]>32&&a[i]<65||a[i]>90&&a[i]<97||a[i]>122&&a[i]<127)
    //if(a[i]>'a'&&a[i]<'z'||a[i]>'A'&&a[i]<'Z'||a[i]>0&&a[i]>9)
   {
      continue;
    }
    else 
    {
      cout<<a[i];
    }
  }
}