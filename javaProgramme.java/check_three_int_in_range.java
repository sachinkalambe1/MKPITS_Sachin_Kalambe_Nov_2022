//Write a C program to check whether three given integer values are in the range 20..50
//        inclusive.
//        Return true if 1 or more of them are in the said range otherwise return false.
import java.util.Scanner;

public class check_three_int_in_range {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first integer");
        int a=sc.nextInt();

        System.out.println("enter second integer");
        int b=sc.nextInt();

        System.out.println("enter third integer");
        int c= sc.nextInt();

        if(a>=20 &&a<=50 ||b>=20 && b<=50 || c>=20 && c<=50){

            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
