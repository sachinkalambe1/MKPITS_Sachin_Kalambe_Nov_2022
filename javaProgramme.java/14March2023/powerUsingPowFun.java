//Write a java progrmme to calculate power using pow() function.

import java.util.*;
class powerUsingPowFun{
public static void main(String[]args){
Scanner Sc=new Scanner(System.in);
System.out.println("Enter base number");
int base=Sc.nextInt();
System.out.println("Enter power number");
int power=Sc.nextInt();
int result=1;
while(power!=0){
result=base*result;
--power;
	}
	System.out.println(result);

}
}