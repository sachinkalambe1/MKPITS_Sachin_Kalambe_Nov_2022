//Create a class called "Vehicle" with two child classes "Car" and "Truck".
//Each child class should have its own unique method

public class Vehical1 {
    void vehi(){
        System.out.println("Vehical called");
    }
}
class Car extends Vehical1{
    void car1(){
        System.out.println("car called");
    }
}
class Truck extends Vehical1{
    void tru(){
        System.out.println("Truck called");
    }
}
class vehical_Inherit{
    public static void main(String[]ags){
        Truck ob=new Truck();
        ob.vehi();
        ob.tru();
        Car ob1=new Car();
        ob1.car1();
    }
}