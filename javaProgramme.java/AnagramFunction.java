import java.util.Arrays;

class Anagram{
    void isAngram(String s1,String s2){
     String str1=s1.replaceAll("\\s","");
     String str2=s2.replaceAll("\\s","");
       boolean status=true;
       if (str1.length()!= str2.length()){
        status=false;
       }
       else {
           char[] arrayS1 = str1.toLowerCase().toCharArray();
           char[] arrays2 = str2.toLowerCase().toCharArray();

           Arrays.sort(arrayS1);
           Arrays.sort(arrays2);

           status=Arrays.equals(arrayS1,arrays2);
       }
       if(status){
           System.out.println("Anagram");
       }
       else {
           System.out.println("Not Anagram");
       }
    }
}
public class AnagramFunction {
    public static void main(String[]args){
       Anagram an=new Anagram();
       an.isAngram("sile nt","lis ten");
    }
}
