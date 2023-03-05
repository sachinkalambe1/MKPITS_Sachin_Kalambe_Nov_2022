//write a java programme to check number is Armstrong or not.

import java.util.*;
class Armstrong{
public static void main(String[]args){

Scanner Sc=new Scanner(System.in);
System.out.println("Enter any number");
int num=Sc.nextInt();
int temp,rev,sum=0;
temp=num;
while(num>0){
	rev=num%10;
	sum=sum+(rev*rev*rev);
	num=num/10;
	}
	if(temp==sum){
		System.out.println("Armstrong number");
		}
		else{
			System.out.println("Not Armstrong number");
			}

}
}