#include<stdio.h>
#include<conio.h>
struct student
{
int id;
char name[10];
char address[10];
}s1;
void main()
{
clrscr();
printf("Enter student id= ");
scanf("%d",&s1.id);
printf("Enter Student name= ");
scanf("%s",s1.name);
printf("Enter student address= ");
scanf("%s",s1.address);
printf("student id= %d",s1.id);
printf("\n student name= %s",s1.name);
printf("\n student address = %s",s1.address);
getch();
}
