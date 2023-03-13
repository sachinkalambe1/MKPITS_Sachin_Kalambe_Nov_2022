//Write a java programme to calculate factorial using itrative method.

import java.util.*;
class factorial_Iterative{
public static void main(String[]args){
Scanner Sc=new Scanner(System.in);
System.out.println("Enter any number");
int num=Sc.nextInt();
int fact=0;
for(int i=0;i<=num;i++){
	fact=fact+num*(num-1);
	}
System.out.println(fact);
}
}