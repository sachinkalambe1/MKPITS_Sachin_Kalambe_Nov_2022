#include<stdio.h>
#include<conio.h>
void main()
{
clrscr();
int r,c;
for(r=1;r<=4;r++)
{
for(c=1;c<=r;c++)
{
printf("%d",c);
}
printf("\n");
}
getch();
}
