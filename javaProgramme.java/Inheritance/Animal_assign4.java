//Create a parent class called "Animal" and create two child classes
//"DomesticAnimal" and "WildAnimal". Each child class should have its own
//unique method.
class Animal4{
    void ani(){
        System.out.println("Animal called");
    }
}
class DomesticAnimal extends Animal4{
    void DoAni(){
        System.out.println("DomesticAnimal animal");
    }
}
class Wild_Animal extends Animal4{
    void wildAni(){
        System.out.println("Wild animal");
    }
}
public class Animal_assign4 {
    public static void main(String[]args){
        Wild_Animal wa=new Wild_Animal();
        wa.ani();
        wa.wildAni();
        DomesticAnimal da=new DomesticAnimal();
        da.DoAni();
    }
}
