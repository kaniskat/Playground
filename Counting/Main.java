#include<iostream>
using namespace std;
int main()
{
   char a[198];
   cin.getline(a,198);
  int i,vowels=0,whitespace=0,symbols=0,digits=0,consonants=0;
  for(i=0;a[i]!='\0';++i)
  {
    if(a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'||a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
    {
      vowels=vowels+1;
    }
    else if(a[i]>='a'&&a[i]<='z'||a[i]>='A'&&a[i]<='Z')
    {
      consonants=consonants+1;
    }
    
    else if(a[i]==' ')
    {
      whitespace=whitespace+1;
    }
    else if(a[i]>='0'&&a[i]<='9')
    {
      digits=digits+1;
    }
    else
    {
      symbols=symbols+1;
    }
  }
  cout<<"Vowels:"<<vowels<<"\nConsonants:"<<consonants<<"\nWhite Spaces:"<<whitespace<<"\nDigits:"<<digits<<"\nSymbols:"<<symbols;
}
      
