//Write a java code to remove character from String in Java.

import java.util.*;
class RemoveCharecter{
public static void main(String[]args){

Scanner Sc=new Scanner(System.in);
System.out.println("Enter Any String");
String a=Sc.nextLine();
StringBuffer sb=new StringBuffer(a);

System.out.println(sb.replace(1,3,""));
}
}