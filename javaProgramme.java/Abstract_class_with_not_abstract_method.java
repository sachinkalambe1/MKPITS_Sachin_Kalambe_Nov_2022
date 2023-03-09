
 interface biketype{

   void sound1();

   default String bike1(){

       System.out.println("hii");
       return null;
   }

}
 class honda implements yamaha ,biketype{

   public void sound1(){

       System.out.println("broom broom");
   }


}
interface  yamaha {

    void sound1() ;


}

public class Abstract_class_with_not_abstract_method {

    public static void main(String[] args) {

        honda d1= new honda() ;

        d1.sound1();
        d1.bike1();


    }
}