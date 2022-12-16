#include<iostream.h>
#include<conio.h>
#include<string.h>
void main()
{
clrscr();
int s;
char user[10]={"Ram"},userPass[10]={"Ram"},userk[10],userPassk[10];
cout<<"Enter user name :";
cin>>userk;
cout<<"Enter password :";
cin>>userPassk;
s=strcmp(user,userk);
s=strcmp(userPass,userPassk);
if(s==0)
{
if(s==0)
{
clrscr();
cout<<"welcome to AbC Bank";
}}
else
{
cout<<"Invalid";
}
getch();
}
