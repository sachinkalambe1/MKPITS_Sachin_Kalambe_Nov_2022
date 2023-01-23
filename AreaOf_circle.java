class AreaC
{
 int r=50;
 double AreaOfC;

 void calculate()
 {

 AreaOfC=3.14*r*r;
 }

 void show()
 {
 System.out.println(AreaOfC);
 }
}

public class AreaOf_circle{

public static void main(String[] args)
{
AreaC s=new AreaC();
s.calculate();
s.show();

}
}