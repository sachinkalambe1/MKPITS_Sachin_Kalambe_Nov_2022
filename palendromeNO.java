import java.util.Scanner;

public class palendromeNO {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num= sc.nextInt();
        int temp=num;
        int sum=0;
        while(num>0){
            int r=num%10;
            sum=sum*10+r;
            num=num/10;

        }
        if(sum==temp){
            System.out.println("palendrome");
        }
        else {
            System.out.println("Not");
        }
    }
}
