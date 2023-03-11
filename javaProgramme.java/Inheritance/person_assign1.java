//.Create a parent class called "Person" and create two child classes
//"Student" and "Teacher". Each child class should have its own unique
//method.

class person3{
    void per(){
        System.out.println("person called");
    }
}
class Student1 extends person3{
    void Stu(){
        System.out.println("Student called");
    }
}
class Teacher extends person3{
    void teach(){
        System.out.println("Teacher called");
    }
}
public class person_assign1 {
    public static void main(String[]args){
        Teacher t=new Teacher();
        t.per();
        t.teach();
        Student1 st=new Student1();
        st.Stu();
    }
}
