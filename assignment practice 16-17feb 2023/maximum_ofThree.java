//write java programme to accept three integer and find the maximum between three.

import java.util.*;
class maximum_ofThree{
public static void main(String[]args)
{

Scanner Sc=new Scanner(System.in);
System.out.println("Enter 1st number");
int n1=Sc.nextInt();

System.out.println("Enter 2nd number");
int n2=Sc.nextInt();

System.out.println("Enter 3rd number");
int n3=Sc.nextInt();

if(n1>n2 && n1>n3)
{
	System.out.println("n1 is greater");
	}
	if(n2>n1 && n2>n3)
	{
		System.out.println("n2 is greater");

		}
		if(n3>n1 && n3>n2)
		{
			System.out.println("n3 is greater");
			}

}
}