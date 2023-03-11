//Vehicle interface and bicycle and motorcycle classes:
//Create an interface called Vehicle that has two abstract methods: start() and
//stop(). Then create two classes called Bicycle and Motorcycle that implement
//the Vehicle interface. The Bicycle class should have an instance variable for the
//number of gears, and the Motorcycle class should have an instance variable for
//the engine displacement. Implement the start() and stop() methods for each
//class.
interface Vehical{
    void start();
    void stop();
}
class Bicycle implements Vehical{
    public int numberOfgear;
    @Override
    public void start() {
        System.out.println("Start engine bhhom bhhom");
    }

    @Override
    public void stop() {
        System.out.println("stop engine");
    }
}
class motorcycle implements Vehical{
    public int engineDisplacement;
    @Override
    public void start() {
        System.out.println("Insert key start engine bhhommm");
    }

    @Override
    public void stop() {
        System.out.println("press break stop motorcycle");
    }
}
public class Vehical_Interface {
    public static void main(String[]args){
        motorcycle mt=new motorcycle();
        mt.start();
        mt.stop();
        Bicycle bi=new Bicycle();
        bi.start();
        bi.stop();
    }
}
