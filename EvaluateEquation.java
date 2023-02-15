
import java.util.Scanner;

public class EvaluateEquation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value for x: ");
    int x = sc.nextInt();
    System.out.print("Enter value for n: ");
    int n = sc.nextInt();
    
    int result = 1;
    for (int i = 0; i < n; i++) {
      result *= x;
    }
    
    System.out.println("Result: " + result);
  }
}

