//Write a java programme to calculate distance between two point.

import java.util.*;

class distance{
public static void main(String[]args)
{

Scanner Sc=new Scanner(System.in);
System.out.println("Enter 1st point");
int p1=Sc.nextInt();

System.out.println("Enter 2 nd point");
int p2=Sc.nextInt();

double distance=0.5*(p2-p1)*(p2-p1);

System.out.println(distance);
}
}