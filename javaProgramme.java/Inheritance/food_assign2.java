//.Create a parent class called "Food" and create two child classes "Dessert"
//and "MainCourse". Each child class should have its own unique method.
class Food2{
    void foo(){
        System.out.println("food");
    }
}
class Dessert extends Food2{
    void dess(){
        System.out.println("Dessert");
    }
}
class MainCourse extends Food2{
    void MaiC(){
        System.out.println("MainCourse");
    }
}
public class food_assign2 {
    public static void main(String[]args){
        MainCourse mn=new MainCourse();
        mn.foo();
        mn.MaiC();
        Dessert ds=new Dessert();
        ds.dess();
    }
}
