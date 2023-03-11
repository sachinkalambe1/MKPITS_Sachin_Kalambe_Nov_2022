//Create a parent class called "Shape" and create two child classes
//"Rectangle" and "Square" that inherit from it. Override the area method
//in the Rectangle class.

class shape3{
    void area(){
    };
}
class Rectangle2 extends shape3{
    @Override
    void area() {
        int length=2,width=3;
        int aeraR=length*width;
        System.out.println("area of rectangle :"+aeraR);
    }
}
class Square1 extends shape3{
    void sq(){
        System.out.println("sqaure");
    }
}
public class shape_assign3 {
    public static void main(String[]args){
Rectangle2 rec=new Rectangle2();
rec.area();
    }
}
