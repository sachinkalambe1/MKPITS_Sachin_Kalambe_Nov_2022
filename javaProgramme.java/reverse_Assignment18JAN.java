import java.util.*;
class reverse_Assignment18JAN
{
public static void main(String[]args)
{

 Scanner Sc=new Scanner (System.in);
 System.out.println("Enter Any number");
 int num=Sc.nextInt();
int n1,n2,n3,n4,n5;
n1=num%10;
num=num/10;
n2=num%10;
num=num/10;
n3=num%10;
num=num/10;
n4=num%10;
num=num/10;
n5=num%10;
int rev=n1*10000+n2*1000+n3*100+n4*10+n5*1;
System.out.println(rev);
}}