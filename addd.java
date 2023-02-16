import java.util.*;

interface one{
void absMethod();
}

class add implements one{

 public void absMethod(){

Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num=Sc.nextInt();

int n1=num%10;
num=num/10;
int n2=num%10;
num=num/10;
int n3=num%10;
num=num/10;

	}
}

class addd{
public static void main(String[]args)
{

add ad=new add();
ad.absMethod();
}
}