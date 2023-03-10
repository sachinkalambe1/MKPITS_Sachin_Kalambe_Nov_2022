//. Create a parent class called "Animal" and create three child classes "Dog",
//"Cat" and "Bird" that inherit from it. Each child class should have its own
//unique method.
public class Animal {
    void animals(){
        System.out.println("Animals type");
    }
}
class Dog extends Animal{
    void Dog(){
        System.out.println("Dog is animal");
    }
}
class Cat extends Animal{
    void Cat(){
        System.out.println("Cat is also animal");
    }
}
class Bird extends Animal{
    void bird(){
        System.out.println("birds are beatiful");
    }
}
class Inhert{
    public static void main(String[]args){
 Bird ob=new Bird();
        ob.animals();
 ob.bird();
 Cat ob1=new Cat();
 ob1.Cat();
 Dog ob2=new Dog();
 ob2.Dog();

    }
}