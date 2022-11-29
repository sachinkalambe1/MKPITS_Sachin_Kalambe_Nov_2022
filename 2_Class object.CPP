#include<iostream.h>
#include<conio.h>
class one
{
public:
int a,b;
void setvalue()
{
cout<<"Enter value of a :";
cin>>a;
cout<<"Enter value of b :";
cin>>b;
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
ob.setvalue();
ob.displayvalue();
getch();
}
