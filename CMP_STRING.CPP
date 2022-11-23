#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
clrscr();
char name[10],name2[10];
int s;
printf("Enter your name ");
scanf("%s",name);
printf("Enter name2 ") ;
scanf("%s",name2);
s=strcmp(name2,name);
if(s==0)
{
printf("equal");
}
else
{
printf("not equal");
}
getch();
}
