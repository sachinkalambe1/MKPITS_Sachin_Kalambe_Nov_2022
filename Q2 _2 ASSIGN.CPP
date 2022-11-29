#include<iostream.h>
#include<conio.h>
void main()
{
clrscr();
int n1,n2,n3,n4,n5,Oadd=0,Eadd;
cout<<"Enter any five number";
cin>>n1>>n2>>n3>>n4>>n5;
if(n1%2==0)
{
Eadd=Eadd+n1;
}
else
{
Oadd=Oadd+n1;
}
if(n2%2==0)
{
Eadd=Eadd+n2;
}
else
{
Oadd=Oadd+n2;
}
if(n3%2==0)
{
Eadd=Eadd+n3;
}
else
{
Oadd=Oadd+n3;
}
if(n4%2==0)
{
Eadd=Eadd+n4;
}
else
{
Oadd=Oadd+n4;
}
if(n5%2==0)
{
Eadd=Eadd+n5;
}
else
{
Oadd=Oadd+n5;
}
cout<<"Oadd ="<<Oadd;
getch();
}

