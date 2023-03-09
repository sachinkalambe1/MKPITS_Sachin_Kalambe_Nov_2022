//Write a C program to check a given integer and return true if it is within 10 of 100 or 200.

import java.util.Scanner;
public class check_in_range {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a integer");
        int a=sc.nextInt();

        if((a-100<=10) ||(a-200)<=10){

            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}