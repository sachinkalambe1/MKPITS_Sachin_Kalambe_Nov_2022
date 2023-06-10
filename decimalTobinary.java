import java.util.Scanner;

public class decimalTobinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num= sc.nextInt();
        int arr[]=new int[10];
        int index=0;
        while(num>0){
            arr[index]=num%2;
            index++;
            num=num/2;
        }
        for (int i=index-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
