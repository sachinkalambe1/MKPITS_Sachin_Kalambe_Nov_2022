#include<iostream.h>
#include<conio.h>
void main()
{
clrscr();
int n1,n2,n3;
cout<<"Enter three number :";
cin>>n1>>n2>>n3;
if(n1>n2 && n1>n3)
{
cout<<"n1 is greater";
}
else if(n2>n1 && n2>n3)
{
cout<<"n2 is greater";
}
else
{
cout<<"n3 is greater";
}
getch();
}