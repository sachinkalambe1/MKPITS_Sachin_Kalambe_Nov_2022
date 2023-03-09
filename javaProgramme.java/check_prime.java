//Write a C program that prints out the prime numbers between 1 and 200.

import java.util.Scanner;
public class check_prime {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range of prime");
        int a= sc.nextInt();
        boolean prime=true;
        for (int i = 1; i < a; i++) {
             prime=true;
            for (int j = 2; j <i ; j++) {

            if(i%j==0){
                prime=false;
                break;
            }
            }
            if(prime){
                System.out.println(i);
            }
        }

        }
    }
