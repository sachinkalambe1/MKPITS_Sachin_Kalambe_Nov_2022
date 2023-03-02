class kangalException extends Exception
{

kangalException(String s)
{
//super(s);
}
}

class trowAndTrows{
public static void main(String[]args)throws Exception
{
int bal=3000;
int width=5000;

if(bal>width){

System.out.println("rupay le lo");
}

else
{
kangalException ob=new kangalException("Paise le lo");
throw ob;
}
}
}