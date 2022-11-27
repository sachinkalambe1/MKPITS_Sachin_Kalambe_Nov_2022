#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int id,salary,TwHm,AmH;
printf("Enter Employee Id :");
scanf("%d",&id);
printf("Enter total work hour per month :");
scanf("%d",&TwHm);
printf("Enter amount received per hour :");
scanf("%d",&AmH);
salary=TwHm*AmH;
printf("\n Salary of an Employee=%d",salary);
getch();
}
