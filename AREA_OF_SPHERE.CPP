#include<stdio.h>
#include<conio.h>
void main()
{
int r,area;
clrscr();
printf("Enter radius of sphere =");
scanf("%d",&r);
area=4*3.14*r*r;
printf("Area of sphere =%d",area);
getch();
}