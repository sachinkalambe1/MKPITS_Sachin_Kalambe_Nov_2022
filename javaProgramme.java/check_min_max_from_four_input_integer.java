//Write a C program that accepts 4 real numbers from the keyboard and
//        print out the difference of the maximum and minimum values of these four numbers.

import java.util.Scanner;

public class check_min_max_from_four_input_integer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a :");
        int a= sc.nextInt();

        int min,max;

        System.out.println("enter b :");
        int b= sc.nextInt();

        System.out.println("enter c :");
        int c= sc.nextInt();

        System.out.println("enter d :");
        int d= sc.nextInt();

        if(a>b && a>c && a>d){
            max=a;
        }
        else if(b>a && b>c && b>d){

            max=b;
        }
        else if (c>a && c>b && c>d){
            max=c;
        }
        else{
            max=d;
        }
        if(a<b &&a<c && a<d){
            min=a;
        }
        else if(b<a && b<c && b<d){
            min=b;
        } else if (c<a &&c<b && c<d) {
            min=c;
        }
        else {
            min=d;
        }

        System.out.println("minimum number is : "+min);
        System.out.println("maximum number is : "+max);
        int difference= max-min;

        System.out.println("difference is : "+difference);
    }
}
