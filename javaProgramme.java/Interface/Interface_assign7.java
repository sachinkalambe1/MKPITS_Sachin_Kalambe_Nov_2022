//Shape interface and circle and rectangle classes:
//Create an interface called Shape that has two abstract methods: getArea() and
//getPerimeter(). Then create two classes called Circle and Rectangle that
//implement the Shape interface. The Circle class should have an instance variable
//for the radius of the circle, and the Rectangle class should have instance
//variables for the width and height of the rectangle. Implement the getArea() and
//getPerimeter() methods for each class.
interface shape6{
    void getArea();
    void getPerimeter();
}
class circle5 implements shape6{
    public int radius=2;
    @Override
    public void getArea() {
        double areaC=3.14*radius*radius;
        System.out.println("areaC :"+areaC);
    }

    @Override
    public void getPerimeter() {
        double perimeterC=2*3.14*radius;
        System.out.println(perimeterC);
    }
}
class Rectangle5 implements shape6{
    public int width=2,length=3;
    @Override
    public void getArea() {
        double areaR=width*length;
        System.out.println(areaR);
    }

    @Override
    public void getPerimeter() {
        double perimeterR=2*(length+width);
        System.out.println(perimeterR);
    }
}
public class Interface_assign7 {
    public static void main(String[]args){
Rectangle5 rec=new Rectangle5();
rec.getArea();
rec.getPerimeter();
circle5 cir=new circle5();
cir.getArea();
cir.getPerimeter();
    }
}
