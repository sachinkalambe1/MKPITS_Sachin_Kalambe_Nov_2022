class formula2
{
int w=5,l=3;
double AreaR;

void cal()
{
AreaR=w*l;
}

void show()
{
System.out.println(AreaR);
}
}

 class AreaOf_Rectangle
{
public static void main(String[] args)
{

formula2 s1=new formula2();
s1.cal();
s1.show();
}

}