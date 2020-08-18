#include<iostream>
using namespace std;
struct employee
{
  char name[30];
  int empid;
  int age;
  char design[50];
  int salary;
};
int main()
{
  employee e;
  cout<<"Enter name:\n";
  cin>>e.name;
  cout<<"Enter ID:\n";
  cin>>e.empid;
  cout<<"Enter age:\n";
  cin>>e.age;
  cout<<"Enter designation:\n";
  cin>>e.design;
  cout<<"Enter Salary:\n";
  cin>>e.salary;
  cout<<"Employee Details \n";
  cout<<"Name of the Employee : "<<e.name<<"\n";
  cout<<"ID of the Employee : "<<e.empid<<"\n";
  cout<<"Age of the Employee : "<<e.age<<"\n";
  cout<<"Designation of the Employee : "<<e.design<<"\n";
  cout<<"Salary of the Employee : "<<e.salary<<"\n";
}
  