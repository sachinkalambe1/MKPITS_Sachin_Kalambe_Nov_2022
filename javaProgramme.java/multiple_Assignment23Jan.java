import java.util.*;
class multiple_Assignment23Jan{

public static void main(String[]args){
Scanner Sc=new Scanner(System.in);
System.out.println("Enter any number");
int num=Sc.nextInt();
if(num>0){

else if(num%3==0 && num%7==0){

	System.exit(0);
	}
	else if(num%3==0){
		System.out.println("number is multiple of 3");
		}
		else if(num%7==0){
			System.out.println("number is multiple of 7");
			}
			else{
				System.out.println("number is not multiple of 3,7,both");
				}

}
}