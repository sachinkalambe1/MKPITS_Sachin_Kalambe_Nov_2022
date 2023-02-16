class finally1
{
public static void main(String[]args)
{
System.out.println("Start of programme");
int a=2;
int c=0;
try{
c=a/2;

}
catch(ArithmeticException e){
System.out.println("Exception occured");
}
finally{
	System.out.println("finally occured");
	}
System.out.println("End of programme" +c);
}
}