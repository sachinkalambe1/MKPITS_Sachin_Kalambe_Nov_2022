//Create a class called "Person" with two child classes "Parent" and "Child".
//Each child class should have its own unique method.
public class person2 {
    void per(){
        System.out.println("person called");
    }
}
class parent extends person2{
    void par(){
        System.out.println("parent called");
    }
}
class child extends person2{
    void chi(){
        System.out.println("child called");
    }
}
class person_Inherit{
    public static void main(String[]args){
        child ob=new child();
        ob.per();
        ob.chi();
        parent ob1=new parent();
        ob1.par();
    }
}
