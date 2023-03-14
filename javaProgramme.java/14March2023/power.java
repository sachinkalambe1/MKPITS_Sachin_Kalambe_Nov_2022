//Write a jaa programme to calculate power using pow method.

import java.util.*;

class power{
public static void main(String[]args){

Scanner Sc=new Scanner(System.in);
System.out.println("Enter base number");
int base=Sc.nextInt();

System.out.println("Enter power number");
int power=Sc.nextInt();
double result=Math.pow(base,power);
System.out.println(result);
}
}