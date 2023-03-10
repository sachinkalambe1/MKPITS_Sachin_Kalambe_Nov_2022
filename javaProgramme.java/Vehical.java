//Create a parent class called "Vehicle" and create two child classes "Car"
//and "Motorcycle" that inherit from it. Give each child class its own unique
//method.

class vehical{
    void vehical1(){
        System.out.println("vehicals types");
    }
}
class car extends vehical{
   void car1(){
       System.out.println("car is type of vehical");
   }
}
class Motorcycle extends vehical{
    void motor(){
        System.out.println("Motorcycle is type of vehical");
    }
    public static void main(String[]args){
Motorcycle ob=new Motorcycle();
car ob2=new car();
ob.vehical1();
ob.motor();
ob2.car1();

    }
}




