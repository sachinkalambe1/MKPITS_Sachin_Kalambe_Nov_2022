//write a java programme  that accept four integer number p,q,r,s from user where r and s are
//positive and p is even, if q is greater than r And s is greater than p And sum of r&s greater than the sum of p&q
//print correct value otherwise wrong value.

import java.util.*;

class four_Integer{
public static void main(String[]args)
{

Scanner Sc=new Scanner(System.in);
System.out.println("Enter value 1st integer number");
int p=Sc.nextInt();

System.out.println("Enter 2nd intger number");
int q=Sc.nextInt();

System.out.println("Enter 3rd intger number");
int r=Sc.nextInt();

System.out.println("Enter 4th intger number");
int s=Sc.nextInt();

if(r>0 && s>0 && p%2==0)
{
	 if(q>r && s>p && (r+s)>(p+q))
	{
		System.out.println("Correct value");
		}

	else{

		System.out.println("Wrong value");
	}}
}
}