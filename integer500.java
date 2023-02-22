//Write a C program that accepts a positive integer less than 500 and prints out the sum of the digits of this number.

import java.util.*;
class integer500{
public static void main(String[]args)
{
 Scanner Sc=new Scanner (System.in);
 System.out.println("Enter number");
 int num=Sc.nextInt();
 int n1,n2,n3;
 if(num>0 )
 {
   if(num<500)
 {
 n1=num%10;
 num=num/10;
 n2=num%10;
 num=num/10;
 n3=num%10;

 int sum=n1+n2+n3;
 System.out.println(sum);
 }
 else
 {
 System.out.println("number is greater than 500");
}}
}
}