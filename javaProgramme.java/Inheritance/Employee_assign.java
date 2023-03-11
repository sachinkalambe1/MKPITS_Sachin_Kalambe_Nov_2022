//.Create a class called "Employee" with two child classes "Manager" and
//"Clerk". Each child class should have its own unique method.

class Employee2{
    void em(){
        System.out.println("Emp called");
    }
}
class Manager1 extends Employee2{
    void Man(){
        System.out.println("Man called");
    }
}
class clerk extends Employee2{
    void cl(){
        System.out.println("clerk called");
    }
}
public class Employee_assign {
    public static void main(String[]args){
        clerk cl=new clerk();
        cl.em();
        cl.cl();
        Manager1 mn=new Manager1();
        mn.Man();
    }
}
