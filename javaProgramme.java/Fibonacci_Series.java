//write a java programe to print Fibonacci series using Iterative methods.

import java.util.*;
class Fibonacci_Series{
public static void main(String[]args){

int first=0,second=1,result;

Scanner Sc=new Scanner(System.in);
 System.out.println("Enter any number to print upto range of fibonacci series");
 int num=Sc.nextInt();
System.out.println(first);
System.out.println(second);

 for(int i=0;i<(num-2);i++){
		result=first+second;
		 first=second;
		 second=result;
		// System.out.println(result);
	 }
	 System.out.println(result);
}
}