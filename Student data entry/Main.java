#include <iostream>
#include<string.h>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  struct student s;
  cin.getline(s.name,50);
  cin>>s.roll;
  cin>>s.marks;
  cout<<"\nStudent Details \n";
  cout<<"Name: "<<s.name<<"\n";
  cout<<"Roll: "<<s.roll<<"\n";
  cout<<"Marks: "<<s.marks<<"\n";
}