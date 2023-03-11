//Create a parent class called "Food" and create two child classes "Fruit"
  //      and "Vegetable". Each child class should have its own unique method.
class Food{
    void foo(){
        System.out.println("food");
    }
}
class Fruit extends Food{
    void fru(){
        System.out.println("fruit");
    }
}
class Vegitables extends Food{
    void vegi(){
        System.out.println("Vegitables ");
    }
}
public class food1_inheritance {
    public static void main(String[]args){
        Vegitables ob=new Vegitables();
        ob.foo();
        ob.vegi();
        Fruit ob1=new Fruit();
        ob1.fru();
    }
}
