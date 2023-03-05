//write a java programe to check given number is prime number or not.

import java.util.*;

class checkPrimeNumber{
public static void main(String[]args){
Scanner Sc=new Scanner(System.in);

System.out.println("Enter any number");
int num=Sc.nextInt();
int count=0;
for(int i=1;i<=num;i++){
	if(num%i==0){
		count++;
		}
	}
	if(count==2){
		System.out.println("prime number");
		}
		else{
			System.out.println("Not prime number");
			}
}
}