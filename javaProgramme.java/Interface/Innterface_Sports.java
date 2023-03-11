// Sports interface and basketball and football classes:
//Create an interface called Sports that has two abstract methods: playGame() and
//getEquipment(). Then create two classes called Basketball and Football that
//implement the Sports interface. The Basketball class should have an instance
//variable for the ball's size, and the Football class should have an instance
//variable for the football's shape. Implement the playGame() and getEquipment()
//methods for each class.

interface Sports{
    void playGame();
    void getEquipment();

}
class basketball implements Sports{
    public int ballsize;
    @Override
    public void playGame() {
        System.out.println("Good");
    }

    @Override
    public void getEquipment() {
        System.out.println("basketball");
    }
}
class football implements Sports{
    @Override
    public void playGame() {
        System.out.println("nice");
    }

    @Override
    public void getEquipment() {
        System.out.println("football");
    }
}
public class Innterface_Sports {
    public static void main(String[]args){
        football ft=new football();
        ft.playGame();
        ft.getEquipment();
        basketball bs=new basketball();
        bs.playGame();
        bs.getEquipment();
    }
}
