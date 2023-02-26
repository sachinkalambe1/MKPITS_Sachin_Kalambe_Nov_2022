//Write a C program to evaluate the equation y=xn when n is a non-negative integer.
import java.util.*;
class NonNegative_Assignment18Jan
{
public static void main(String[]args){
Scanner Sc=new Scanner(System.in);
System.out.println("Enter value of n");
int n=Sc.nextInt();

if(n>=0){
	System.out.println("Enter value of x");
int x=Sc.nextInt();
int y=x*n;
System.out.println(y);
}
else{
System.out.println("n is negative interger");
}
}
}