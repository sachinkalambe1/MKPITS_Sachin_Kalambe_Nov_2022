//Write a java programe to convert tempreture Fahrenheit to celsius.

import java.util.*;
class ConvertTemp{
public static void main(String[]args){
Scanner Sc=new Scanner(System.in);
System.out.println("Enter any tempreture in fahrenheit to convert into celsius");
double Fahrenheit=Sc.nextDouble();
double celsius=((Fahrenheit-32)*5)/9;
System.out.println("Celsius Tempreture:"+celsius);
}
}