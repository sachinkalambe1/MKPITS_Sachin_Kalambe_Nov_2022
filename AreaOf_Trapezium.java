class formula4
{
int base1=2,base2=3,height=5;
double AreaT;

void cal()
{
AreaT=0.5*(base1+base2)*height;
}

void show()
{
System.out.println(AreaT);
}
}

class AreaOf_Trapezium
{
public static void main(String[] args)
{

formula4 s4=new formula4();
s4.cal();
s4.show();
}
}