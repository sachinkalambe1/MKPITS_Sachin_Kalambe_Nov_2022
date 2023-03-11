//Shape interface and ellipse and rhombus classes:
//Create an interface called Shape that has two abstract methods: getArea() and
//getPerimeter(). Then create two classes called Ellipse and Rhombus that
//implement the Shape interface. The Ellipse class should have instance variables
//for the major and minor axes, and the Rhombus class should have instance
//variables for the diagonals. Implement the getArea() and getPerimeter()
//methods for each class.
interface shape7{
    void getArea();
    void getPerimter();
}
class ellipse implements shape7{
    public int majoraxes_length=2,minoraxes_length=4;
    @Override
    public void getArea() {
        double areaE=3.14*majoraxes_length*minoraxes_length;
        System.out.println(areaE);
    }

    @Override
    public void getPerimter() {
double perimeterE=2*3.14*1.414*((majoraxes_length*majoraxes_length)+(minoraxes_length*minoraxes_length))*0.5;
        System.out.println(perimeterE);
    }
}
class rhombus implements shape7{
    public int diagonal1=2,diagonal2=4;
    int side1=1,side2=2,side3=3,side4=4;
    @Override
    public void getArea() {
        double areaR=diagonal1*diagonal2*0.5;
        System.out.println(areaR);
    }

    @Override
    public void getPerimter() {
double perimeterR=side1+side2+side3+side4;
        System.out.println(perimeterR);
    }
}
public class shape_Interface {
    public static void main(String[]args){
        rhombus rh=new rhombus();
        rh.getArea();
        rh.getPerimter();
        ellipse el=new ellipse();
        el.getArea();
        el.getPerimter();
    }
}
