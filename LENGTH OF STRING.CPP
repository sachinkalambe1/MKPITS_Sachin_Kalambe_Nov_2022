#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
clrscr();
char name[10];
int len;
printf("Enter your name ");
scanf("%s",name);
len=strlen(name);
printf("%d",len);
getch();
}
