//write a java programe to check it is palendrome number or not.

import java.util.*;
class check_palendromeNUM{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);

System.out.println("Enter any number");
int num=sc.nextInt();
int original=num;
int rev=0;
while(num>0){
	int remainder=num%10;
	rev=rev*10+remainder;
	num=num/10;
	}

System.out.println(rev);

if(original==rev){
	System.out.println("palendrome number");
	}
	else{
		System.out.println("Not palendrome number");
		}
}
}