//Animal interface and dog and cat classes:
//Create an interface called Animal that has two abstract methods: makeSound()
//and move(). Then create two classes called Dog and Cat that implement the
//Animal interface. The Dog class should have an instance variable for the dog's
//breed, and the Cat class should have an instance variable for the cat's name.
//Implement the makeSound() and move() methods for each class.
interface Animal5{
    void makeSound();
    void move();
}

class dog implements Animal5{
    public int dogbreed;

    @Override
    public void makeSound() {
        System.out.println("bhoo bhoo");
    }

    @Override
    public void move() {
        System.out.println("fast");
    }
}
class cat implements Animal5{
    public int catName;
    @Override
    public void makeSound() {
        System.out.println("Mauu Mauu");
    }

    @Override
    public void move() {
        System.out.println("slowely");
    }
}
public class Interface_dog {
    public static void main(String[]args){
        cat c=new cat();
        c.makeSound();
        c.move();
        dog d=new dog();
        d.makeSound();
        d.move();
    }

}
