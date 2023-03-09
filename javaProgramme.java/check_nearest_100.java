//Write a C program to check which number
//        nearest to the value 100 among two given integers.

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class check_nearest_100 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first integer");
        int a = sc.nextInt();

        System.out.println("enter first integer");
        int b= sc.nextInt();

        if(a<=100 && b<=100 ){

            if(a<b){
                System.out.println("nearest b");
            }
            else{
                System.out.println("nearest a");
            }
        }

    }
}