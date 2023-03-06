//write a java programe to find sum of digits of entered number.

import java.util.*;
class Sum_of_digit{
public static void main(String[]args){

Scanner Sc=new Scanner(System.in);
System.out.println("Enter any number");
int num=Sc.nextInt();
int sum=0;
while(num>0){
	sum=sum+num%10;
	num=num/10;
	}
	System.out.println(sum);
}
}