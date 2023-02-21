// Write a java programme to accept three floating values and check if it is possible to make triangle with them,
//also calculate the perimeter of triangle if the set value are valid.

import java.util.*;

class make_Triangle{
public static void main(String[]args)
{

Scanner Sc=new Scanner(System.in);
System.out.println("Enter ist intger number");
float a=Sc.nextFloat();

System.out.println("Enter 2nd intger number");
float b=Sc.nextFloat();

System.out.println("Enter 3rd intger number");
float c=Sc.nextFloat();

if((a+b+c)==180){
	System.out.println("Valid to make triangle");

	float perimter=a+b+c;
	System.out.println("perimter of triangle:"+perimter);

	}
}
}