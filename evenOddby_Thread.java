import java.util.*;


class th1 extends Thread
{
	public void run()
	{
		Scanner Sc=new Scanner(System.in);
int num=Sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Even Num");
			}
			else{
				System.out.println("Odd Num");
				}
		}

}



class evenOddby_Thread{

public static void main(String[]args){

th1 ob=new th1();
ob.run();
ob.setName("Sachin");
ob.getPriority();

Thread mth=Thread.currentThread();
System.out.println(mth);
System.out.println(ob);
//ob.start();
}
}