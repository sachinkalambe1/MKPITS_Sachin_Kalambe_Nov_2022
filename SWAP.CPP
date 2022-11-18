#include<stdio.h>
#include<conio.h>
void main()
{
int num1,num2,swap;
clrscr();
printf("Enter Two number");
scanf("%d%d",&num1,&num2);
printf("Before swaping \n num1=%d num2=%d",num1,num2);
swap=num2;
num2=num1;
num1=swap;
printf("\n After swaping \n num1=%d num2=%d",num1,num2);
getch();
}
