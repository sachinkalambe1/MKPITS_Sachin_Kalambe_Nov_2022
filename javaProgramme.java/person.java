//Create a parent class called "Person" with two child classes "Student" and
//"Teacher". Each child class should have its own unique method.

public class person {
    void per(){
        System.out.println("person called");
    };
}
class Student extends person{
    void Stu(){
        System.out.println("Student call");
    }
}
class teacher extends person{
    void tech(){
        System.out.println("teacher called");
    }
}
class Person_inherit{
    public static void main(String[]args){
        teacher ob=new teacher();
        ob.per();
        ob.tech();
        Student ob1=new Student();
        ob1.Stu();
    }
}
