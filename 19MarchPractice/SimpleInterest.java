//Write a java programe to calculate simple intrest.

import java.util.*;
class SimpleInterest{
public static void main(String[]args){
Scanner Sc=new Scanner(System.in);
System.out.println("Enter principle amount");
double P=Sc.nextDouble();
System.out.println("Enter time period");
double T=Sc.nextDouble();
System.out.println("Enter the rate of interest");
double I=Sc.nextDouble();
double SimpleInterest=(P*T*I)/100;
System.out.println("SimpleInterest :"+SimpleInterest);
}
}