//write a java programe to find LCM of two number.

import java.util.*;
class LCM_TwoNum{
public static void main(String[]args){

Scanner Sc=new Scanner(System.in);
System.out.println("Enter first number");
int num1=Sc.nextInt();
System.out.println("Enter Second number");
int num2=Sc.nextInt();
int maxNum=num1>num2?num1:num2;
while(true){
	if(maxNum%num1==0 && maxNum%num2==0){
		System.out.println("LCM :"+maxNum);
break;
		}
		maxNum++;
	}
}
}