class ExceptionHandling{
public static void main(String[]args){

System.out.println("Start Programme");
int a=2;
int c=0;
 try {
	 c=a/2;
}
catch(ArithmeticException e)
{
	System.out.println("Eception occured");
	}
System.out.println("End programme" +c);
}}