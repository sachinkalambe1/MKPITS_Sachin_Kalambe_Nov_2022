import java.util.Scanner;

public class ArmstrongNumber{

public static void main(String[]args){
int sum=0;

Scanner scanner=new Scanner(System.in);
System.out.println("Enter any number");
int num=scanner.nextInt();

int temp=num;
while(num>0){
int n1=num%10;
sum=sum+(n1*n1*n1);
num=num/10;
}
if(sum==temp){
System.out.println("Armstrong Number");
}
else{
System.out.println("Not Armstrong number");
}
}
}