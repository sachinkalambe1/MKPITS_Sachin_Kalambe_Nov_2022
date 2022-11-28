#include<iostream.h>
#include<conio.h>
void main()
{
clrscr();
int n1,n2,n3,num,original;
cout<<"Enter three digit number :";
cin>>num;
original=num;
n1=num%10;
num=num/10;
n2=num%10;
num=num/10;
n3=num%10;
int c=n1*n1*n1+n2*n2*n2+n3*n3*n3;
if(original==c)
{
cout<<"It is amstrong No";
}
else
{
cout<<"It is Not Amstrong No";
}
getch();
}
