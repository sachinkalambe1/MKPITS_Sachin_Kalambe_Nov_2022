import java.util.Scanner;

//Write Java Program to check given input is Digit or not.
class CheckDigitOrNot{
   public void Digit(){
       System.out.println("Enter any charecter anything including alpahbet or digit");
       Scanner sc=new Scanner(System.in);
       char ch=sc.next().charAt(0);
       if (ch>='0' && ch<='9'){
           System.out.println("It is digit");
       }
       else {
           System.out.println("It is alphabet");
       }

    }
}
public class CheckDigit {
    public static void main(String[]args){
        CheckDigitOrNot cd=new CheckDigitOrNot();
        cd.Digit();

    }
}
