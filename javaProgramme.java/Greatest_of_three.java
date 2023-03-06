//write a java programme to find greatest of three number.

import java.util.*;
class Greatest_of_three{
public static void main(String[]args){
Scanner Sc=new Scanner(System.in);

System.out.println("Enter first Number");
int a=Sc.nextInt();
System.out.println("Enter second Number");
int b=Sc.nextInt();
System.out.println("Enter third Number");
int c=Sc.nextInt();
 if(a>b && b>c){
	 System.out.println("a is greater");
	 }
	 else if(b>a && b>c){
		 System.out.println("b is greater");
		 }
		 else if(c>a && c>b){
			 System.out.println("c is greater");
			 }
}
}