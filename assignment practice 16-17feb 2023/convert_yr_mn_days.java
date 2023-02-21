//Write java programme to enter integer in days and convert to year months and days assume all months have 30 days year have 365 days.

import java.util.*;
class convert_yr_mn_days{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);

System.out.println("Enter days");
int days=sc.nextInt();

int year=days/365;
days=days%365;

int months=days/30;
days=days%30;

System.out.println("year:"+year+" " +"Months:"+months+" "+ "days:"+days);
}
}