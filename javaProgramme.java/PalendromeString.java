import java.util.Scanner;

class palendrome{
    void palen(){
        System.out.println("Enter any string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder s1=new StringBuilder(str);
        String str1= String.valueOf(s1.reverse());
        String s2=str.toLowerCase();
        String s3=str1.toLowerCase();
if (s2.equals(s3)){
    System.out.println("palendrome");
}
else {
    System.out.println("Not palendome");
}
    }
}
public class PalendromeString {
    public static void main(String[]args){
        palendrome pal=new palendrome();
        pal.palen();
    }
}
