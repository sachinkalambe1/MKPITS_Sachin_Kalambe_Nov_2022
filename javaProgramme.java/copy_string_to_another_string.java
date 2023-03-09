import java.util.Scanner;

public class copy_string_to_another_string {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String ab= sc.nextLine();

        String copy;

        copy =new String(ab);


        System.out.println(" original String : "+ab);
        System.out.println("copy string : "+copy);

    }
}