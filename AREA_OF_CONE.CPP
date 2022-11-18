#include<stdio.h>
#include<conio.h>
void main()
{
int r,l,area;
clrscr();
printf("Enter radius and lenght of cone =");
scanf("%d%d",&r,&l);
area=3.14*r*l;
printf("Area of cone =%d",area);
getch();
}