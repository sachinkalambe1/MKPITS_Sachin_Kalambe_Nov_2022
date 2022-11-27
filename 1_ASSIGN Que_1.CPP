#include<stdio.h>
#include<conio.h>
void main()
{
float w1,w2,Np,tw,avg;
clrscr();
printf("Enter weights ");
scanf("%f%f",&w1,&w2);
printf("Enter number of purchase ");
scanf("%f",&Np);
tw=w1+w2;
avg=tw/Np;
printf("Average =%f",avg);
getch();
}
