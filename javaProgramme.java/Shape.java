//Create a class called "Shape" that has a method to calculate its area.
//Create three child classes "Rectangle", "Triangle", and "Circle" that inherit
//from the Shape class and override the area method.

class Shape {
    void calculate_Area(){

    }
}
class Rectangle extends Shape{
    @Override
    void calculate_Area() {
        int length=2,width=3;
      int areaR=length*width;
        System.out.println("area of rectangle :"+areaR);
    }
}
class Triangle extends Shape{
    @Override
    void calculate_Area() {
        int base=5,height=2;
        double areaT=0.5*base*height;
        System.out.println("Area of triangle :"+areaT);
    }
}
class circle extends Shape{
    @Override
    void calculate_Area() {
        int radius=4;
        double areaC=3.14*radius*radius;
        System.out.println("Area of circle:"+areaC);
    }
}
 class shape_inherit{
    public static void main(String[]args){
        circle ob=new circle();
        ob.calculate_Area();
        Triangle ob1=new Triangle();
        ob1.calculate_Area();
        Rectangle ob2=new Rectangle();
        ob2.calculate_Area();
    }
}