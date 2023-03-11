//Vehicle interface and car and truck classes:
//Create an interface called Vehicle that has two abstract methods: drive() and
//stop(). Then create two classes called Car and Truck that implement the Vehicle
//interface. The Car class should have instance variables for the car's make and
//model, and the Truck class should have instance variables for the truck's load
//capacity and towing capacity. Implement the drive() and stop() methods for
//each class.
interface vehical7{
    void drive();
    void stop();
}
class car6 implements vehical7{
    public String make,model;
    @Override
    public void drive() {
        System.out.println("Good");
    }

    @Override
    public void stop() {
        System.out.println("slowely");
    }
}
class Truck1 implements vehical7{
    public int loadCapacity,TowingCapacity;
    @Override
    public void drive() {
        System.out.println("Truck required heavy driver");
    }

    @Override
    public void stop() {
        System.out.println("stopping truck hard");
    }
}
public class Interface_vehical1 {
    public static void main(String[]args){
        Truck1 t=new Truck1();
        t.drive();
        t.stop();
        car6 c=new car6();
        c.drive();
        c.stop();
    }
}
