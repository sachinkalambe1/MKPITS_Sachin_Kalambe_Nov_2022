import java.util.*;
class palendrome
{
public static void main(String[]args){

Scanner Sc=new Scanner(System.in);
System.out.println("Enter Any number");
int num=Sc.nextInt();

int n1=num%10;
num=num/10;
int n2=num%10;
num=num/10;
int n3=num%10;

if(n1==n3)
{
System.out.println("palendrome");
}
else{
System.out.println("NOt Palendrome");
}

}
}