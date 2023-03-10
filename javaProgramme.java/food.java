//Create a parent class called "Food" and create three child classes "Pizza",
//"Burger", and "Sushi" that inherit from it. Each child class should have its
//own unique method.
public class food {
    void foo(){
        System.out.println("Food called");
    }
}
class Pizza extends  food{
    void pizz(){
        System.out.println("Pizza called");
    }
}
class Burger extends food{
    void burg(){
        System.out.println("Burger called");
    }
}
class Sushi extends food{
    void suh(){
        System.out.println("Sushi called");
    }
}
class Food1{
    public static void main(String[]args){
        Sushi ob =new Sushi();
        ob.foo();
        ob.suh();
        Burger ob1=new Burger();
        ob1.burg();
        Pizza ob2=new Pizza();
        ob2.pizz();
    }
}
