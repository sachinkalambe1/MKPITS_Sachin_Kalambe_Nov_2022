#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
clrscr();
char name[10];
printf("Enter your name ");
scanf("%s",name);
strrev(name);
printf("%s",name);
getch();
}
