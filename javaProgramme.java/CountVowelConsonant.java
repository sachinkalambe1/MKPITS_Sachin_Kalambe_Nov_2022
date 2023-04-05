import java.util.Scanner;

public class CountVowelConsonant {
    public static void main(String[]args){
        System.out.println("Enter any string");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
int Consonant=0, vowel=0;
        char s1[]=s.toCharArray();
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
            if(s1[i]!='a' && s1[i]!='e'&& s1[i]!='i' && s1[i]!='o' && s1[i]!='u'){
                Consonant++;
            }
            else {
              vowel++;
            }
        }
        System.out.println("Vowel in the String:"+vowel);
        System.out.println("Consonant in the string:"+Consonant);
    }
}
