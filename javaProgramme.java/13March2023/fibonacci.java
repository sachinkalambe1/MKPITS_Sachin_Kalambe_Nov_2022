//Write a java programe to print fibonacci series.

import java.util.*;
class fibonacci{
public static void main(String[]args){
Scanner Sc=new Scanner(System.in);
System.out.println("Enter number upto which fibonacci series print");
int num=Sc.nextInt();
int first=0,secound=1;
int result=0;
System.out.println(first);
	System.out.println(secound);
for(int i=0;i<num;i++){
result=first+secound;
first=secound;
secound=result;
System.out.println(result);
}

}
}