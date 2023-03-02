// Write a C program that accepts integers from the user until a zero or a negative number,
//display the number of positive values, the minimum value, the maximum value and the average of all numbers.


import java.util.*;
class UserInputAssignment18JAN
{
public static void main(String[]args)
{
	int counter=0;
	int SumofNumber=0;

Scanner Sc=new Scanner(System.in);
System.out.println("Enter positive integer number ");
int num=Sc.nextInt();

if(num<=0){

	System.exit(0);
	}
int max=num;
 int min=num;
while(num>0){
	counter++;
	SumofNumber +=num;

	max = num> max ? num : max;
      min =num < min ? num : min;
      System.out.println("Enter next positive integer number");
num=Sc.nextInt();
}
	double avg=SumofNumber/counter;

	System.out.println("maximum : "+max);
	System.out.println("Minimum :"+min);
	System.out.println("No of positive integer :"+counter);
	System.out.println("Average :"+avg);
	}
}
