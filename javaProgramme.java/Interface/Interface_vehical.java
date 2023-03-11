//Vehicle interface and car and motorcycle classes:
//Create an interface called Vehicle that has two abstract methods: start() and
//stop(). Then create two classes called Car and Motorcycle that implement the
//Vehicle interface. The Car class should have instance variables for the car's make
//and model, and the Motorcycle class should have an instance variable for the
//motorcycle's engine size. Implement the start() and stop() methods for each
//class.
interface vehical1{
    void start();
    void stop();
}
class car1 implements vehical1{
    public String cars_make,model;

    @Override
    public void start() {
        System.out.println("Insert key and start car bhrum bhrum");
    }

    @Override
    public void stop() {
        System.out.println("press break and stop car");
    }
}
class Motorcycle1 implements vehical1{
    public int engine_size;
    @Override
    public void start() {
        System.out.println("bhrumm bhrum");
    }

    @Override
    public void stop() {
        System.out.println("chech chechhh");
    }
}
public class Interface_vehical {
    public static void main(String[]args){
        Motorcycle1 m=new Motorcycle1();
        m.start();
        m.stop();
        car1 c=new car1();
        c.start();
        c.stop();
    }
}
