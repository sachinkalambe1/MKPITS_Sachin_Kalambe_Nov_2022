class twoCatchUsed
{
public static void main(String[]args)
{
	int a=2;
	int c=0;
try{
	c=a/0;
int b[]={1,2,3,4};
for(int i=0;i<=b.length;i++){
System.out.println(b[i]);
}}
catch(ArrayIndexOutOfBoundsException S){
	System.out.println("Exception occured");
	}
catch(ArithmeticException A){
System.out.println(" Exception 2 occured" +c);
System.out.println(A.getMessage());
A.printStackTrace();
}
//finally{
	//System.out.println("Finally exception occured");
	//}
System.out.println("Sachin Kalambe");
}
}