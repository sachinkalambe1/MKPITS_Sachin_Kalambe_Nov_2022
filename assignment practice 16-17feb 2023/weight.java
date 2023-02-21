//write java programme to accept user input weight(flating point) of item calculate the average of that.

import java.util.*;
class weight{
public static void main(String[]args)
{

Scanner Sc=new Scanner(System.in);
System.out.println("Enter number of item to calculate average");
int n=Sc.nextInt();
double sum=0;
for(int i=0;i<n;i++){
	System.out.println("Enter weight of item");
double w=Sc.nextDouble();
sum=sum+w;

}
double avg=sum/n;
System.out.println("average :"+avg);
}
}