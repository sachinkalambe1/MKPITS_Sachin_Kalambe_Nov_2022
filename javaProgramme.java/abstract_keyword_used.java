//write a java programme to used abstarct keyword.

 abstract class auto{

   public  abstract void run() ;

}
 class bolt extends auto{
    public void run(){
        System.out.println("run running");
    }

}

public class abstract_keyword_used {
	public static void main(String[]args){
		bolt b=new bolt();
		b.run();
		}
}
