#include<iostream.h>
#include<conio.h>
class one
{
public:
int a,b;
one()
{
cout<<"consturctor called \n";
a=2;b=3;
}
void display()
{
cout<<a<<" "<<b<<endl;
}};
void main()
{
clrscr();
one ob1,ob2;
ob1.display();
ob2.display();
getch();
}