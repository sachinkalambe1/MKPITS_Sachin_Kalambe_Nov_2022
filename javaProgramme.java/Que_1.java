class sample{
void sample_output(){
	int x;
for(x=1;x<=15;x=x+3)
{
System.out.print(x+" ");
x=x+2;
System.out.print(x +" ");
x=x+4;
System.out.print(x+" ");
x=x+6;
System.out.print(x+" ");
System.out.println(" ");
}
}
}
class Que_1{
public static void main(String[]args){
sample ob=new sample();
ob.sample_output();
}
}