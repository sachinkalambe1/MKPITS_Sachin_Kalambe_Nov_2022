//Write a C program to find the larger value from two positive integer values that is in the range 20..30

import java.util.Scanner;
public class check_largest_in_range {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter a");
        int a= sc.nextInt();
        System.out.println("enter b");
        int b= sc.nextInt();

        if(a>=20 && a<=30 && b>=20 &&b<=30){
           if(a>b) {

               System.out.println("a is greater");
           }
           else{
               System.out.println("b  is greater");
           }

        }
        else{
            System.out.println("not in range");
        }
    }
}