//Write a java programe to print first n prime number.

import java.util.*;

class primeNumber{
public static void main(String[]args){
Scanner Sc=new Scanner(System.in);
System.out.println("Enter any number");
int num=Sc.nextInt();

for(int i=2;i<=num;i++){
	if(num%2!=0){
		System.out.println(num);
		}
	}
}
}