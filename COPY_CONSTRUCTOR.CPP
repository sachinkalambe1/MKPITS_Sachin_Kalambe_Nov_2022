#include<iostream.h>
#include<conio.h>
class one
{
public:
int a,b;
one()
{}
one(int x,int y)
{
a=x;
b=y;
}
void dis()
{
cout<<a<<" "<<b<<endl;
}
one(one &ob1)
{
a=ob1.a;
b=ob1.b;
}
};
void main()
{
clrscr();
one ob1(2,3);
one ob2(ob1);
ob2.dis();
getch();
}