import java.util.Scanner;
class Palindrome{
int num;
void poli()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
num=sc.nextInt();
System.out.println("num :"+num);
int n1=num%10;
num=num/10;
int n2=num%10;
num=num/10;
int n3=num%10;
num=num/10;
int n4=num%10;
num=num/10;
int n5=num%10;

if(n1==n5 && n2==n4){

System.out.println("Number is palendrome");
}
else{
System.out.println("Not palendrome");
}
}
}
class Que_3{
public static void main(String[]args)
{

Palindrome ob=new Palindrome();
ob.poli();
}
}