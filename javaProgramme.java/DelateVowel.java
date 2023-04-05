import java.util.Scanner;

public class DelateVowel {
    public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        String s=sc.nextLine();
        System.out.println(s.replaceAll("[AaeIiOoUu]",""));

}}
