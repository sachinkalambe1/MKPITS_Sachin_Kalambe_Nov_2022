//.Create a class called "Person" with two child classes "Adult" and "Child".
//Each child class should have its own unique method.

class person1{
    void per(){
        System.out.println("person called");
    }
}
class Adult extends person1{
    void Adu(){
        System.out.println("Adult called");
    }
}
class child1 extends person1{
    void chi(){
        System.out.println("child called");
    }
}
public class person_assign {
    public static void main(String[]args){
        child1 ch=new child1();
        ch.per();
        ch.chi();
        Adult ad=new Adult();
        ad.Adu();
    }
}
