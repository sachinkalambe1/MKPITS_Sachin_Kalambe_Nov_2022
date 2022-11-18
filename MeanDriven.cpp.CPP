#include<stdio.h>
#include<conio.h>
void main()
{
int choice,a,b,result;
clrscr();
printf("press 1 for addition");
printf("\n press 2 for substraction");
printf("\n press 3 for multiplication");
printf("\n press 4 for Division");
printf("\n Enter your choice");
scanf("%d",&choice);
if(choice==1)
{
printf("Enter value of a and b");
scanf("%d%d",&a,&b);
result=a+b;
printf("Addition =%d",result);
}
else if(choice==2)
{
printf("Enter value of a and b");
scanf("%d%d",&a,&b);
result=a-b;
printf("Substraction =%d",result);
}
else if(choice==3)
{
printf("Enter value of a and b");
scanf("%d%d",&a,&b);
result=a*b;
printf("Multiplication =%d",result);
}
else if(choice==4)
{
printf("Enter value of a and b");
scanf("%d%d",&a,&b);
result=a/b;
printf("Division =%d",result);
}
else
{
printf("Invalid");
}
getch();
}
