import java.util.*;

class average{
public static void main(String[]args)
{

Scanner Sc=new Scanner(System.in);
System.out.println("Enter distance trevelled");
int distance=Sc.nextInt();

System.out.println("Enter SpentFuel ");
double spent_fuel=Sc.nextDouble();

double avg=distance/spent_fuel;
System.out.println(avg);

}
}