//Write a C program that prints out the prime numbers between 1 and 200.


import java.util.*;
class primeNumber
{
public static void main(String[]args){

Scanner Sc=new Scanner(System.in);
//System.out.println("Enter number");
//int num=Sc.nextInt();

for( int i=2; i<200 ;i++)
{
	if(i%2!=0)
	{
		System.out.println(i);
		}
	}
}
}