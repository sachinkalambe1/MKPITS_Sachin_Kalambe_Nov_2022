//Create a class called "Employee" with two child classes "Manager" and
//"Developer". Each child class should have its own unique method.

public class Employee {
    void emp(){
        System.out.println("Employee called");
    }
}
class Manager extends Employee{
    void Mane(){
        System.out.println("Manager called");
    }
}
class Developer extends Employee{
    void Dev(){
        System.out.println("Developer called");
    }
}
class Employee1{
    public static void main(String[]args){
        Developer ob=new Developer();
        ob.emp();
        ob.Dev();
        Manager ob1=new Manager();
        ob1.Mane();
    }
}
