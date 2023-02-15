import java.util.*;
class DiffMaxAndmin_Assignment18JAN

{
public static void main(String[]args)
{
Scanner Sc=new Scanner(System.in);
System.out.println("Enter 1st number");
int n1=Sc.nextInt();
System.out.println("Enter 2nd number");
int n2=Sc.nextInt();
System.out.println("Enter 3rd number");
int n3=Sc.nextInt();
System.out.println("Enter 4th number");
int n4=Sc.nextInt();
int max,min;
if(n1>=n2 && n1>=n3 && n1>=n4 )
{
	max=n1;
	}
	else if(n2>=n1 && n2>=n3 && n2>=n4)
	{
		max=n2;
		}
	else if(n3>=n1 && n3>=n2 && n3>=n4)
		{
			max=n3;
			}
	else
			{
				max=n4;
				}

if(n1<=n2 && n1<=n3 && n1<=n4 )
{
	min=n1;
	}
else if(n2<=n1 && n2<=n3 && n2<=n4)
	{
		min=n2;
		}
		else if(n3<=n1 && n3<=n2 && n3<=n4)
		{
			min=n3;
			}
			else
			{
				min=n4;
				}
			int	Difference=max-min;
System.out.println("Difference between Maximum and Minimum :"+Difference);

}}