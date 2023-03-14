//write a java programe to swap two number with third variable.

import java.util.*;

class swap_with_third_variable{
public static void main(String[]args){

Scanner Sc=new Scanner(System.in);
System.out.println("Enter first number");
int a=Sc.nextInt();
System.out.println("Enter second number");
int b=Sc.nextInt();
int c;
c=b;
b=a;
a=c;
 System.out.println("a="+a);
 System.out.println("b="+b);

}
}