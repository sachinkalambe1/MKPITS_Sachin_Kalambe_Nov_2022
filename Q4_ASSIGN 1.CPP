#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int distance;
float SpentFuel,Average;
printf("Enter Total distance traveled :");
scanf("%d",&distance);
printf("Enter total fuel spent :");
scanf("%f",&SpentFuel);
Average=distance/SpentFuel;
printf("Average consumption of bike =%f",Average);
getch();
}
