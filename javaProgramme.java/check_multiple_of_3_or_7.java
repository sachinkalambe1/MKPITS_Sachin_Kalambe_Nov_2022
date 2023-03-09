//Write a C program to check if a given positive number is a multiple of 3 or a multiple of 7.

import java.util.Scanner;
public class check_multiple_of_3_or_7 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an a :");
        int a= sc.nextInt();

        if(a>0 && a%3==0 ||a%7==0){

            System.out.println("a is multiple of  3 or 7");
        }
        else{
            System.out.println("not multiple of 3 or 7");
        }
    }
}
