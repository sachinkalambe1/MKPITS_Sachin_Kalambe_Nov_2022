//Write a java program to get the absolute difference between n and 51.
//        If n is greater than 51 return triple the absolute difference.

import java.util.Scanner;

public class absolute_difference {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int n=sc.nextInt();
        int x=51;
        if(n>x){

            System.out.println("triple of difference : "+(n-x)*3);
        }
        else{
            System.out.println("difference is : "+(x-n));
        }


    }

}
