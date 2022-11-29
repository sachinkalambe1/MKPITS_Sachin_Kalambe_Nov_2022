#include<iostream.h>
#include<conio.h>
class demoObject
{
public:
int a[9],i;
void setData();
void display();
};
void demoObject::setData()
{
cout<<"Enter 10 array element :";
for(i=1;i<=9;i++)
{
cin>>a[i];
}
}
void demoObject::display()
{
for(i=1;i<=9;i++)
{
cout<<a[i];
}
}

void main()
{
clrscr();
demoObject s;
s.setData();
s.display();
getch();
}
