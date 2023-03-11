//Shape interface and rectangle and circle classes:
//Create an interface called Shape that has two abstract methods: getArea() and
//getPerimeter(). Then create two classes called Rectangle and Circle that
//implement the Shape interface. The Rectangle class should have instance
//variables for the length and width of the rectangle, and the Circle class should
//have an instance variable for the radius of the circle. Implement the getArea()
//and getPerimeter() methods for each class.
interface shape4{
   void getArea();
   void getPerimeter();
}
class rectangle5 implements shape4{
   public int length=2,width=3;
   @Override
   public void getArea() {
      int areaR=length*width;
      System.out.println(areaR);
   }

   @Override
   public void getPerimeter() {
      int perimeterR=2*(length+width);
      System.out.println(perimeterR);
   }
}
class circle1 implements shape4 {
   public int radius = 2;

   @Override
   public void getArea() {
      double areaC = 3.14 * radius * radius;
      System.out.println(areaC);
   }

   @Override
   public void getPerimeter() {
      double pariCircle = 2 * 3.14 * radius;
      System.out.println(pariCircle);
   }
}
   public class Interface_shape {
public static void main(String[]args){
   circle1 cr=new circle1();
   cr.getArea();
   cr.getPerimeter();
   rectangle5 rec=new rectangle5();
   rec.getArea();
   rec.getPerimeter();
}
   }


