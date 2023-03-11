//Game interface and chess and checkers classes:
//Create an interface called Game that has two abstract methods: play() and
//getRules(). Then create two classes called Chess and Checkers that implement
//the Game interface. The Chess class should have an instance variable for the
//number of pieces, and the Checkers class should have an instance variable for
//the size of the board. Implement the play() and getRules() methods for each
//class.
interface Game{
    void play();
    void getRules();
}
class chees implements Game{
    public int numberOfpieaces;
    @Override
    public void play() {
        System.out.println("chees is brillent game");
    }

    @Override
    public void getRules() {
        System.out.println("difficult to understand");
    }
}
class cheakers implements Game{
    public int sizeOfboard;
    @Override
    public void play() {
        System.out.println("good");
    }

    @Override
    public void getRules() {
        System.out.println("very good");
    }
}
public class Interface_Game {
    public static void main(String[]args){
        cheakers ch=new cheakers();
        ch.play();
        ch.getRules();
        chees cs=new chees();
        cs.play();
        cs.getRules();
    }
}
