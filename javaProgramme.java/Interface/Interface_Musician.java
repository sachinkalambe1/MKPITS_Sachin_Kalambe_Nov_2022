//Musician interface and guitar and drums classes:
//Create an interface called Musician that has two abstract methods:
//playInstrument() and sing(). Then create two classes called Guitarist and
//Drummer that implement the Musician interface. The Guitarist class should
//have an instance variable for the guitar's brand, and the Drummer class should
//have an instance variable for the drum's size. Implement the playInstrument()
//and sing() methods for each class.

interface Musician {
    void playInstrument();
    void sing();

}
class guitarist implements Musician{
    public String guitarBrand;
    @Override
    public void playInstrument() {
        System.out.println("I love Guiter");
    }

    @Override
    public void sing() {
        System.out.println("I like to sing song on guitar music");
    }
}
class Drummer implements Musician{
    public int drumSize;
    @Override
    public void playInstrument() {
        System.out.println("dumm dumm");
    }

    @Override
    public void sing() {
        System.out.println("good");
    }
}
public class Interface_Musician {
    public static void main(String[]args){
        Drummer d=new Drummer();
        d.playInstrument();
        d.sing();
        guitarist g=new guitarist();
        g.playInstrument();
        g.sing();
    }
}
