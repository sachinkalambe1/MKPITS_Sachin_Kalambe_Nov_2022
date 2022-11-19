#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int num,n1,n2,n3,original,reverse;
printf("Enter 3 digit number");
scanf("%d",&num);
original=num;
n1=num%10;
num=num/10;
n2=num%10;
num=num/10;
n3=num%10;
reverse=n1*100+n2*10+n3*1;
if(original==reverse)
{
printf("It is palendrome number");
}
else
{
printf("It is Not palendrome number");
}
getch();
}
