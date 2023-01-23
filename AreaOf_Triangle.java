class formula3
{
int b=2,h=8;
double AreaT;

void cal()
{
AreaT=0.5*b*h;
}

void show()
{
System.out.println(AreaT);
}
}
 class AreaOf_Triangle
 {

 public static void main(String [] args)
 {
 formula3 s3=new formula3();
 s3.cal();
 s3.show();
 }
 }