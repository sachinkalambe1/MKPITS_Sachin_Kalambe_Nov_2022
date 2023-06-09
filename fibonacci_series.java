import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to get fibonacci series");
        int num= sc.nextInt();
        int n1=0,n2=1;
        System.out.println(n1);
        System.out.println(n2);
        for(int i=0;i<=(num-2);i++){
            int n3=n1+n2;
            n1=n2;
            n2=n3;


            System.out.println(n3);
        }

    }
}
