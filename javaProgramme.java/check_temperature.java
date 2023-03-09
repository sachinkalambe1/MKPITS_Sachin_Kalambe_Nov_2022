//Write a C program to check if one given temperatures is less than 0 and the other is greater than 100.

import java.util.Scanner;
public class check_temperature {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter first tempreture");
        int temp1=sc.nextInt();

        System.out.println("enter second tempreture");
        int temp2=sc.nextInt();

       if( temp1 < 0 && temp2 > 100){

           System.out.println(true);
       }
       else{

           System.out.println(false);
       }

    }
}
