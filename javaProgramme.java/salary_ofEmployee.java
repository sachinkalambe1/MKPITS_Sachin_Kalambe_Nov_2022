import java.util.*;

class salary_ofEmployee{
public static void main(String []args)
{

Scanner Sc=new Scanner(System.in);
System.out.println("Enter employee Id");
int id=Sc.nextInt();

System.out.println("Enter total work hour per month");
int worh_per_hour=Sc.nextInt();

System.out.println("Enter Amount Recived per hour");
int amount=Sc.nextInt();

int salary=worh_per_hour*amount;

System.out.println("Id of Employee :"+id);
System.out.println("Salary of employee of perticular month :"+salary);


}
}