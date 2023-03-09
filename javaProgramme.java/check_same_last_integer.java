import java.util.Scanner;

public class check_same_last_integer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a= sc.nextInt();

        System.out.println("Enter b");
        int b= sc.nextInt();

        if(a%10==b%10){

            System.out.println("Same last digit");
        }else{
            System.out.println("different last digit");
        }
    }
}