//write a java programe to swap two number without using third variable.

import java.util.*;
class Swap_without_third_variable{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
int a=sc.nextInt();
System.out.println("Enter second number");
int b=sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("a="+a);
System.out.println("b="+b);

}
}