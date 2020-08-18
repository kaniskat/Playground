#include <iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,i,j;
  cin>>a>>b>>c>>d>>e;
  if(a==1)
  {
    i=b+d;
    j=c+e;
    cout<<i<<j<<"i";
  }
  else if(a==2)
  {
    i=b-d;
    j=c-e;
    cout<<i<<"+"<<j<<"i";
  }
  else if(a==3)
  { 
    i=(b*d)+(c*(-e));
    j=(b*e)+(c*d);
    cout<<i<<j<<"i";
  }
  else
  {
    cout<<"Invalid choice";
  }
    
}