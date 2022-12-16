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
char ch;
int i=0;
do
{
ch=getch();
userPassk[i]=ch;
cout<<"*";
i++;
} while(ch!='\r');
userPassk[i-1]='\0';
cout<<userPassk;
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
