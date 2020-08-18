#include<iostream>
using namespace std;
struct kani
{
  int inch;
  float feet;
};
int main()
{
  struct kani d1,d2;
  int a;
  float b;
  cin>>d1.inch>>d1.feet;
  cin>>d2.inch>>d2.feet;
  a=d1.inch+d2.inch;
  b=d1.feet+d2.feet;
  if(b>12)
  {
    ++a;
    b=b-12;
  }
  cout<<a<<"\'-"<<b<<"\"";
}