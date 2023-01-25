class object{
	int b=5,a=2;
int res;

void substract()
{
res=b-a;
}
void display()
{
	System.out.println(res);
}
}

public class subObject{

public static void main(String[]args)
{
object s=new object();
s.substract();
s.display();

object s2=s;

s2.display();

s2.a=4;
System.out.println(s.a);
s2.substract();
s2.display();
}
}
