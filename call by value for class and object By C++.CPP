#include<iostream.h>
#include<conio.h>
class one
{
public:
int a,b;
void setvalue(int x ,int y)
{
a=x;
b=y;
}
void displayvalue()
{
cout<<"A="<<a<<" "<<"B="<<b;
}
};
void main()
{
clrscr();
one ob;
ob.setvalue(2,3);
ob.displayvalue();
getch();
}
