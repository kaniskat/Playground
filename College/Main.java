#include<iostream>
#include<string.h>
using namespace std;
struct college
{
  char name[100];
  char city[100];
  int year;
  float percent;
};
int main()
{
  int n,i,j;
  cout<<"Enter the number of colleges\n";
  cin>>n;
  char x[n][100];
  char t[30];
  college c[n];
  for(i=0;i<n;i++)
  {
    cout<<"Enter the details of college "<<i+1;
    cout<<"\nEnter name\n";
    cin>>c[i].name;
    strcpy(x[i],c[i].name);
    cout<<"Enter city\n";
    cin>>c[i].city;
    cout<<"Enter year of establishment \n";
    cin>>c[i].year;
    cout<<"Enter pass percentage \n";
    cin>>c[i].percent;
  }
  //for(i=0;i<n;i++)
  {
    for(j=0;j<n-i-1;j++)
    {
      if (strcmp(x[j],x[j+1])>0);
      {
      strcpy(t,x[j]);
      strcpy(x[j],x[j+1]);
      strcpy(x[j+1],t);
      }
    }
  }//
  cout<<"Details of colleges\n";
  for(i=0;i<n;i++)
  {
    //for(j=0;j<n;j++)
   // {
     // if(strcmp(x[i],c[j].name)==0)
     // {
        cout<<"College:"<<i+1;
        cout<<"\nName:"<<c[i].name;
        cout<<"\nCity:"<<c[i].city;
        cout<<"\nYear of establishment:"<<c[i].year;
        cout<<"\nPass percentage:"<<c[i].percent<<"\n";
      }
   // }
  //}
}
    