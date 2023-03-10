//Create a parent class called "Shape" and create two child classes
//"Rectangle" and "Square" that inherit from it. Override the area method
//in the Square class.
public class shape1 {
    void area(){

    };
}
class Rectangle1 extends shape1{
    void rec(){
        System.out.println("rectangle called");
    }
}
class Square extends shape1{
    @Override
    void area() {
        int s=4;
        int areaS=s*s;
        System.out.println("Area of Square :"+areaS);
    }
}
class shape2{
    public static void main(String[]args){
        Square ob=new Square();
        ob.area();
    }
}
