//write a java programme to accept an integer and check the specified range where it belong
//print the error massage if the number is negative and greater than 80.

import java.util.*;
class Range{
public static void main(String[]args)
{
 Scanner Sc=new Scanner (System.in);

 System.out.println("Enter any number");
 int num=Sc.nextInt();

 if(num<0 || num>80)
 {
	 System.out.println("Error");
	 }

}
}