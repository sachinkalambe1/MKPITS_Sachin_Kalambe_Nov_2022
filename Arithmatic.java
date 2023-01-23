class sub{
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

public class Arithmatic{

public static void main(String[] arg){

sub s=new sub();
s.substract();
s.display();
}
}