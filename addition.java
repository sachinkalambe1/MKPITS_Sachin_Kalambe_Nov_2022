import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number number");
        int num1= sc.nextInt();
        System.out.println("Enter second number");
        int num2= sc.nextInt();
        while (num2!=0){
            num1 ++;
            num2 --;
        }
        System.out.println("Addition of two number :"+num1);
    }
}
