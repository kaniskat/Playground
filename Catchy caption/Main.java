#include <cstring>
#include <iostream>
using namespace std;
int main()
{
   char a[100];
  int i,count=0;
  cin.getline(a,100);
  int k=strlen(a);
  for(i=0;i<k;i++)
  {
    if(a[i]==' ')
    {
      count++;
    }
  }
  if((count+1)<=10)
  {
    cout<<"Caption eligible for the contest";
  }
  else
    cout<<"Caption not eligible for the contest";
}