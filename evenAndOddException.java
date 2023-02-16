import java.util.*;

class EvenException extends Exception
{
	EvenException(String a){
		super(a);
		}
	}

	class OddException extends Exception
	{
		OddException(String a1){
			super(a1);
			}
		}

class evenAndOddException
{

public static void main(String[]args)throws Exception
{
Scanner Sc=new Scanner(System.in);
System.out.println("Enter number");
int num=Sc.nextInt();

if(num%2==0){

EvenException ob=new EvenException("even no");
throw ob;
	}
	else{

		OddException ob1=new OddException("odd no");
		throw ob1;
		}
}
}