#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int year;
printf("Enter year");
scanf("%d",&year);
if(year%4==0)
{
printf("It is Leap Year");
}
else
{
printf("It is Not Leap Year");
}
getch();
}
