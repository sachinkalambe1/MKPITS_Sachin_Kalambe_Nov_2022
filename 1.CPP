#include<iostream.h>
#include<conio.h>
void main()
{
clrscr();
long int num,c=0,n1;
cout<<"Enter n-digit number :";
cin>>num;
for( ;num>0; )
{
n1=num%10;
c=c+1;
num=num/10;
}
cout<<c;
getch();
}
