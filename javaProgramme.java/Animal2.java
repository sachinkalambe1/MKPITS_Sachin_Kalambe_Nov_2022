//Create a parent class called "Animal" and create two child classes
//"Mammal" and "Bird". Each child class should have its own unique
//method.
public class Animal2 {
    void ani(){
        System.out.println("Animal called");
    }
}
class Mammal extends Animal2{
    void Mamm(){
        System.out.println("mammals called");
    }
}
class Bird1 extends Animal2{
    void Bir(){
        System.out.println("Bird called");
    }
}
class Animal_inherit{
    public static void main(String[]args){
        Bird1 ob=new Bird1();
        ob.ani();
        ob.Bir();
        Mammal ob1=new Mammal();
        ob1.Mamm();
    }
}
