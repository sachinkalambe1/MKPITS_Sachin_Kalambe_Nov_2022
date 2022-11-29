#include<iostream.h>
#include<conio.h>
class one
{
public:
int a,b;
void setvalue()
{
a=2,b=3;
}
void displayvalue()
{
cout<<a<<" "<<b;
}
};
void main()
{
clrscr();
class one ob;
ob.setvalue();
ob.displayvalue();
getch();
}
