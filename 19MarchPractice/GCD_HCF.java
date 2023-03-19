//Write a java programe to find GCD(Greatest common divisior) or HCF(highest common factor) of two numbers.

import java.util.*;
class GCD_HCF{
public static void main(String[]args){
Scanner Sc=new Scanner(System.in);
System.out.println("Enter first number");
int num1=Sc.nextInt();
System.out.println("Enter second number");
int num2=Sc.nextInt();
int GCD=0;
int i;
for(i=1;i<=num1 && i<=num2;i++){
	if(num1%i==0 && num2%i==0){
		 GCD=i;
		}
	}
System.out.println(GCD);
}
}