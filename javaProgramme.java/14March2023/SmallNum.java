//write a java programme to find smallest number between three number.

import java.util.*;
class SmallNum{
public static void main(String[]args){
	Scanner Sc=new Scanner(System.in);
	System.out.println("Enter first number");
	int a=Sc.nextInt();
		System.out.println("Enter second number");
	int b=Sc.nextInt();
	System.out.println("Enter third number");
	int c=Sc.nextInt();
if(a<b && a<c){
	System.out.println("a is smallest number");
	}
	if(b<a && b<c){
		System.out.println("b is smallest number");
		}
		if(c<a && c<b){
			System.out.println("c is snallest number");
			}

}
}