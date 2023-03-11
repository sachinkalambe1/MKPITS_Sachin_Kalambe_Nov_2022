//GeometricShape interface and rectangle and circle classes:
//Create an interface called GeometricShape that has one abstract method:
//getArea(). Then create two classes called Rectangle and Circle that implement
//the GeometricShape interface. The Rectangle class should have instance
//variables for the length and width of the rectangle, and the Circle class should
//have an instance variable for the radius of the circle. Implement the getArea()
//method for each class.
interface GeometricShape{
    void getArea();
}
class Rectangle6 implements GeometricShape{
    public int length=3,width=2;
    @Override
    public void getArea() {
        double areaR=length*width;
        System.out.println(areaR);
    }
}
class circle6 implements GeometricShape{
    public int radius=3;
    @Override
    public void getArea() {
        double areaC=3.14*radius*radius;
        System.out.println(areaC);
    }
}
public class GeometricShape_Interface {
    public static void main(String[]args){
        circle6 cir=new circle6();
        cir.getArea();
        Rectangle6 rec=new Rectangle6();
        rec.getArea();
    }
}
