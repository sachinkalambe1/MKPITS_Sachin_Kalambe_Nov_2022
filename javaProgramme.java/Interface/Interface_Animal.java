//Animal interface and cat and dog classes:
//Create an interface called Animal that has two abstract methods: makeSound()
//and move(). Then create two classes called Cat and Dog that implement the
//Animal interface. The Cat class should have an instance variable for the cat's
//breed, and the Dog class should have an instance variable for the dog's weight.
//Implement the makeSound() and move() methods for each class.

interface Animal6{
    void makesound();
    void move();
}
class Cat1 implements Animal6{
    public String catBreed;
    @Override
    public void makesound() {
        System.out.println("Mauu Mauu");
    }

    @Override
    public void move() {
        System.out.println("Slowely");
    }
}
class dog1 implements Animal6{
    public  int dogs_weight;
    @Override
    public void makesound() {
        System.out.println("BHooo Bhooo");
    }

    @Override
    public void move() {
        System.out.println("fast");
    }
}
public class Interface_Animal {
    public static void main(String[]args){
        dog1 dg=new dog1();
        dg.makesound();
        dg.move();
        Cat1 ct=new Cat1();
        ct.makesound();
        ct.move();
    }
}
