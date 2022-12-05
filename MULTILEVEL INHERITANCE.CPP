#include<iostream.h>
#include<conio.h>
class one
{
int a;
public:
void set1()
{
cout<<"Enter value of a";
cin>>a;
}
void dis1()
{
cout<<a;
}};
class two : public one
{
public:
int b;
void set2()
{
cout<<"Enter value of b";
cin>>b;
}
void dis2()
{
cout<<b;
} };
class three :public two
{
public:
int c;
void set3()
{
cout<<"Enter value of c";
cin>>c;
}
void dis3()
{
cout<<c;
}};
void main()
{
clrscr();
three s;
s.set1();
s.set2();
s.set3();
s.dis1();
s.dis2();
s.dis3();
getch();
}
