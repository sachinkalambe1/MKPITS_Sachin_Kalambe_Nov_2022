//Write a C program to compute the sum of the two given integer values.
//        If the two values are the same, then return triple their sum.

import java.util.Scanner;

public class compute_triple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();

        System.out.println("Enter first number");
        int b=sc.nextInt();

        if(a==b){
            System.out.println("triple of same number : "+(a+b)*3);
        }
        else{
            System.out.println("sum of two numbers :"+(a+b));
        }


    }
}