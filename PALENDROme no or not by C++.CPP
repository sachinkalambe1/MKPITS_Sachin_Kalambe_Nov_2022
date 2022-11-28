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
int rev=n1*100+n2*10+n3*1;
if(original==rev)
{
cout<<"It is Palendrome No";
}
else
{
cout<<"It is Not Palendrome No";
}
getch();
}