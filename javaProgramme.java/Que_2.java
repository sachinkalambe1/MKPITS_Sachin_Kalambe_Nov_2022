import java.util.Scanner;
class Multiplication{
int num1,num2,num3;
void mult(){
Scanner sc=new Scanner (System.in);
System.out.println("enter first number");
num1=sc.nextInt();
System.out.println("Enter Second number");
num2=sc.nextInt();
System.out.println("enter third number");
num3=sc.nextInt();
System.out.println(num1+"num1= "+num2+"num2= "+num3+"num3= ");
for(int i=1;i<=10;i++)
{
int mult1=num1*i;
int mult2=num2*i;
int mult3=num3*i;
System.out.print(mult1+" ");
System.out.print(mult2+" ");
System.out.print(mult3+" ");
}
}
}

class Que_2{
public static void main(String[]args){
Multiplication ob=new Multiplication();
ob.mult();
}
}