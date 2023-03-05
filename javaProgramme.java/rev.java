//write a java programme to reverse an integer.

import java.util.*;
class rev {
    public static void main(String ...a){
    int reverse=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please give a number: ");
    int i = sc.nextInt();
	while(i!=0){
		reverse=reverse*10+i%10;
		i=i/10;2
	}
	System.out.println("Number after reverse : "+reverse);

    }
}