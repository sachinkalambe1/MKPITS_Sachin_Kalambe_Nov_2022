//Create a parent class called "Building" and create two child classes
//"House" and "Apartment" that inherit from it. Each child class should
//have its own unique method.
public class Building {
    void build(){
        System.out.println("Building created");
    }
}
class House extends Building{
    void house1(){
        System.out.println("house created");
    }
}
class Apartment extends Building{
    void Apart(){
        System.out.println("Apartment created");
    }
}
class Building1{
    public static void main(String[]args){
        Apartment ob=new Apartment();
        ob.build();
        ob.Apart();
        House ob1=new House();
        ob1.house1();
    }
}
