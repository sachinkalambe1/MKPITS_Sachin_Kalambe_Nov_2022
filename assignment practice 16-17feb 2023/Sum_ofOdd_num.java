// write a java programme to accept five number and sum of odd values between them.

import java.util.*;

class Sum_ofOdd_num{
public static void main(String[]args){

Scanner Sc=new Scanner(System.in);
int sum=0;

for(int i=0;i<5;i++)
{
	System.out.println("Enter number");
	int n=Sc.nextInt();
	if(n%2!=0){
	sum=sum+n;
	}
	}
	System.out.println("Sum of odd number:"+sum);
}
}