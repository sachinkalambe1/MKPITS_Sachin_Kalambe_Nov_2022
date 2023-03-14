//write a java programe to calculate cube of given number.

import java.util.*;
class cubeNum{
public static void main(String[]args){
Scanner Sc=new Scanner(System.in);
System.out.println("Enter any number to find cube of that number");
int num=Sc.nextInt();
int cube=num*num*num;
System.out.println("cube of"+num+" :"+cube);
}
}