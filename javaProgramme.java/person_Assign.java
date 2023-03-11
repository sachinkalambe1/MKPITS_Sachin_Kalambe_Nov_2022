//Create a class called "Person" with two child classes "Employee" and "Customer".
//        Each child class should have its own unique method.

class Person3{
void per(){
    System.out.println("all are one");
}

}
class Employees extends Person3{

    void Emp(){

        System.out.println("shift time");
    }
}
class Customer extends Person3{

    void Cust(){

        System.out.println("customer");
    }
}
public class person_Assign {
    public static void main(String[] args) {

Customer ob=new Customer();
ob.Cust();
ob.per();
Employees ob1=new Employees();
ob1.Emp();
    }
}
