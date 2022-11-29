#include<iostream.h>
#include<conio.h>
class demoObject
{
public:
int num1,num2,res;
void setData()
{
cout<<"Enter num1 and num2 :";
cin>>num1>>num2;
}
void calculate()
{
res=num1+num2;
}
void display()
{
cout<<"Result ="<<res;
}
};
void main()
{
clrscr();
demoObject s;
s.setData();
s.calculate();
s.display();
getch();
}
