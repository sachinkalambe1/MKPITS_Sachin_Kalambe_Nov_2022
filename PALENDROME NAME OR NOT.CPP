#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
clrscr();
char name[10],back[10];
int s;
printf("Enter any name from keyboard");
scanf("%s",name);
strcpy(back,name);
strrev(name);
s=strcmp(back,name);
if(s==0)
{
printf("It is palendrome name");
}
else
{
printf("It is not palendrome name");
}
getch();
}
