//Write a java programe to count the occurrence of given character in a string using Java.

import java.util.*;
class Count_Occurence{
public static void main(String[]args){

Scanner Sc=new Scanner(System.in);
System.out.println("Enter Any String");
String s=Sc.nextLine();
//int a=s.length();// that also way to find occurence of given charecter in string
//System.out.println(a);
int count=0;
char[] ch=new char[s.length()];
 for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
            count++;
        }
System.out.println("Occurence of chrecter in string :"+count);
        // Printing the elements of array
        // using for each loop
        for (char c : ch) {
            System.out.println(c);
        }
}
}