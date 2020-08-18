#include<iostream>
#include<iomanip>
#include<string.h>
using namespace std;
struct student
{
  char name[30];
  char department[20];
  int yearofstudy;
  float cgpa;
};
int main()
{
  int i,j,n;
  cout<<"Enter the number of students \n";
  cin>>n;
  char x[n][30];
  char t[30];
  student s[n];
  for(i=0;i<n;i++)
  {
    cout<<"Enter the details of student "<<i+1<<"\n";
    cout<<"Enter name \n";
    cin.ignore();
    cin.getline(s[i].name,30);
    strcpy (x[i],s[i].name);
    cout<<"Enter department \n";
    cin.getline(s[i].department,20);
    cout<<"Enter year of study \n";
    cin>>s[i].yearofstudy;
    cout<<"Enter cgpa \n";
    cin>>s[i].cgpa;
  }
  for(i=0;i<n;i++)
  for(j=0;j<n-i-1;j++)
  {
    if(strcmp(x[j],x[j+1])>0)
    {
    strcpy(t,x[j]);
    strcpy(x[j],x[j+1]);
    strcpy(x[j+1],t);
    }
  }
  cout<<"Details of students \n";
  for(i=0;i<n;i++)
  {
  for(j=0;j<n;j++)
    {
    if(strcmp(s[j].name,x[i])==0)
    {
    cout<<"Student "<<i+1<<"\n";
    cout<<"Name:"<<s[j].name<<"\n";
    cout<<"Department:"<<s[j].department<<"\n";
    cout<<"Year of study:"<<s[j].yearofstudy<<"\n";
    cout<<"CGPA:"<<setprecision(2)<<s[j].cgpa<<"\n";
    }
    }
  }
}