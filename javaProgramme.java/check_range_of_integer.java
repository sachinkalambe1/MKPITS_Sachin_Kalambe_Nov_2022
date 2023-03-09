//Write a C program to check two given integers whether either of them is in the range 100..200 inclusive.

import java.util.Scanner;
public class check_range_of_integer {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter first integer");
        int a=sc.nextInt();

        System.out.println("enter second integer");
        int b=sc.nextInt();

        if(a>=100 &&a<=200 || b>=100 &&b<=200){

            System.out.println(true);
        }
        else{

            System.out.println(false);
        }

    }
}