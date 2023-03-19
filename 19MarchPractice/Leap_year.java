//Write a java programe to check leap year or not.

import java.util.*;
class Leap_year{
public static void main(String[]args){
Scanner Sc=new Scanner(System.in);
System.out.println("Enter year to check leap or not");
int year=Sc.nextInt();
if(year%400==00){
	System.out.println("It is leap year");
	}
	else if(year%4==0){
		System.out.println("It is leap year");
		}
		else{
			System.out.println("It is not leap year");
			}
}
}