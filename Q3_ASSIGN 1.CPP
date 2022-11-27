#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int i1,i2,i3;
printf("Enter three integer value :");
scanf("%d%d%d",&i1,&i2,&i3);
if(i1>i2 && i1>i3)
{
printf("i1 is greater");
}
else if(i2>i1 && i2>i3)
{
printf("i2 is greater");
}
else
{
printf("i3 is greater");
}
getch();
}
