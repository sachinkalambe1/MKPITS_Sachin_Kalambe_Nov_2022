//Shape interface and square and triangle classes:
//        Create an interface called Shape that has two abstract methods: getArea() and
//        getPerimeter(). Then create two classes called Square and Triangle that
//        implement the Shape interface. The Square class should have an instance
//        variable for the side length of the square, and the Triangle class should have
//        instance variables for the base and height of the triangle. Implement the
//        getArea() and getPerimeter() methods for each class.
interface shape5{
    void getArea();
    void getPerimeter();
}
class square1 implements shape5{
    public int side=3;
    @Override
    public void getArea() {
        double areaS=side*side;
        System.out.println(areaS);
    }

    @Override
    public void getPerimeter() {
double perimeterS=side+side+side+side;
        System.out.println(perimeterS);
    }
}
class Triangle2 implements shape5{
    public int base=3,heigth=4;
    @Override
    public void getArea() {
        double areaT=0.5*base*heigth;
        System.out.println(areaT);
    }

    @Override
    public void getPerimeter() {
double perimeterT=base+base+base;
        System.out.println(perimeterT);
    }
}
public class Interface_shape1 {
public static void main(String[]args){
    Triangle2 t=new Triangle2();
    t.getArea();
    t.getPerimeter();
    square1 s=new square1();
    s.getArea();
    s.getPerimeter();

}
}

