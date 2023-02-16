class finally
{
public static void main(String[]args)
{
System.out.println("Start of programme");
int a=2;
int c;
try{
c=a/0;

}
catch(){
System.out.println("Exception occured");
}
System.out.println("End of programme" +c);
}
}