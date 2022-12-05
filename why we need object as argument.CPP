#include<iostream.h>
#include<conio.h>
class one
{
public:
int a,b;
void setdata(int x, int y)
{
a=x;
b=y;
}
void add(one ob2)
{
int c=a+ob2.a;
int d=b+ob2.b;
cout<<c<<d;
}};
void main()
{
clrscr();
one ob1,ob2;
ob1.setdata(2,3);
ob2.setdata(4,5);
ob1.add(ob2);
getch();
}