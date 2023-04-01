import java.util.Scanner;

//Write a java program to check given character is vowel or consonant.
class VowelOrNot{
    public void Vowel(){
        System.out.println("Enter any charecter to check it is vowel or cosonant");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        System.out.println(ch);
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' ||ch=='I' ||ch=='O' ||ch=='U'){
            System.out.println("It is Vowel");
        }
        else {
            System.out.println("It is consonant");
        }

    }
}
public class checkVowel {
    public static void main(String[]args){
        VowelOrNot Vw=new VowelOrNot();
        Vw.Vowel();
    }
}
