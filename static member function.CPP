#include<iostream.h>
#include<conio.h>
class one
{
public:
int a;
static int b;
static void set()
{
b++;
//a=2;
}
void display()
{
cout<<b<<a<<endl;
}
};int one::b;
void main()
{
one ob1,ob2;
ob1.display();
ob2.display();
ob2.set();
one::set();
ob1.display();
ob2.display();
getch();
}
