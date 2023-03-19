//Write a java programe to Convert Temperature Celsius into Fahrenheit.

import java.util.*;
class TempConvert{
public static void main(String[]args){
Scanner Sc=new Scanner(System.in);
System.out.println("Enter tempreture in celsius");
double celsius=Sc.nextDouble();
double Fahrenheit=(celsius*9/5)+32;
System.out.println("Fahrenheit Tempreture :"+Fahrenheit+"F");
}
}

