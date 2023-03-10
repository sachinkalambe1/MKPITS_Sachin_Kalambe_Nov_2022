//.Create a parent class called "Animal" and create two child classes "Fish"
//and "Reptile". Each child class should have its own unique method.
class Animal1{
    void ani(){
        System.out.println("Animal called");
    }
}
class fish extends Animal1{
    void fis(){
        System.out.println("fish called");
    }
}
class Reptile extends Animal1{
    void rep(){
        System.out.println("Reptile called");
    }
}

public class Assign_animal {
   public static void main(String[]args){
       Reptile ob=new Reptile();
       ob.ani();
       ob.rep();
       fish ob1=new fish();
       ob1.fis();

   }
}
