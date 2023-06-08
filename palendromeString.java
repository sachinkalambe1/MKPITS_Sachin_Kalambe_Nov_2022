import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class palendromeString {
    public static void main(String[]args){
        String sk="pavan";

        StringBuffer s=new StringBuffer(sk);
         s.reverse();
         s.toString();
        if(sk.equals(s.toString())){
            System.out.println("palendome");
        }
        else {
            System.out.println("not");
        }
    }
}
