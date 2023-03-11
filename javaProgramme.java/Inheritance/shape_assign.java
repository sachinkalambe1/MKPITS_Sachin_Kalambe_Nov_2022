//.Create a parent class called "Shape" and create two child classes
//"Triangle" and "EquilateralTriangle" that inherit from it. Override the area
//method in the EquilateralTriangle class.

class shape{
    void area(){

    };
}
class Triangle1 extends shape{
    void tri(){
        System.out.println("triangle");
    }
}
class EquilateralTriangle extends shape{
    @Override
    void area() {
        int side=2;
        double areaET=(1.7320/4)*side*side;
        System.out.println(areaET);
    }
}
public class shape_assign {
    public static void main(String[]args){
        EquilateralTriangle eq=new EquilateralTriangle();
        eq.area();
    }
}
