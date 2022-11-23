#include<stdio.h>
#include<conio.h>
void main()
{
char name[10],name2[10];
clrscr();
printf("Enter  name");
scanf("%s",name);
printf("Enter name2");
scanf("%s",name2);
strcat(name,name2);
printf("%s",name);
getch();
}
