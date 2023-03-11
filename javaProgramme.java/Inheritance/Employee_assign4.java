//.Create a class called "Employee" with two child classes
//"FullTimeEmployee" and "PartTimeEmployee". Each child class should
//have its own unique method.

class Employee4{
    void Emp(){
        System.out.println();
    }
}
class fullTimeEmployee extends Employee4{
    void FullEmp(){
        System.out.println("permaant employee");
    }
}
class partTimeEmployee extends Employee4{
    void partTEmp(){
        System.out.println("part Employee");
    }
}
public class Employee_assign4 {

    public static void main(String[]args){
partTimeEmployee ob=new partTimeEmployee();
ob.Emp();
ob.partTEmp();
fullTimeEmployee ob1=new fullTimeEmployee();
ob1.FullEmp();
    }
}
