//Color interface and red, green, and blue classes:
//Create an interface called Color that has one abstract method: getColorCode().
//Then create three classes called Red, Green, and Blue that implement the Color
//interface. Each class should have an instance variable for its corresponding color
//code (e.g., "FF0000" for red). Implement the getColorCode() method for each
//class.
interface color{
    void getColorCode();
}
class red implements color{
    public int colorCode;
    @Override
    public void getColorCode() {
        System.out.println("red color get");
    }
}
class green implements color{
    public int colorCode;;
    @Override
    public void getColorCode() {
        System.out.println("green color ");
    }
}
class blue implements color{
    public int getColorCode;
    @Override
    public void getColorCode() {
        System.out.println("blue color");
    }
}
public class color_interface {
    public static void main(String[]args){
        blue b=new blue();
        b.getColorCode();
        green g=new green();
        g.getColorCode();
        red r=new red();
        r.getColorCode();
    }
}
