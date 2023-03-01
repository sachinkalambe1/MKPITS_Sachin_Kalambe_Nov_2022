import java.util.*;

class sk1{
public static void main(String []args)
{

Scanner Sc=new Scanner(System.in);
System.out.println("Enter days");
int days=Sc.nextInt();

int year=days/365;
days=days%365;

int week=days/7;
days=days%7;

System.out.println(year+"year "+week+"week "+days+"days ");

}
}