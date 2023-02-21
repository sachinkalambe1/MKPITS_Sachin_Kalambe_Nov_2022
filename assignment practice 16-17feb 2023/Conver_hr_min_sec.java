// Write java programme to convert a given integer in sec into hour min and sec.

import java.util.*;
class Conver_hr_min_sec{
public static void main(String[]args){

Scanner Sc=new Scanner(System.in);
System.out.println("Enter integer value in sec");

int sec=Sc.nextInt();
 int hr=sec/60;
 sec=sec%60;
 int min=sec/60;
 sec=sec%60;

System.out.println("hour:"+hr+" "+"Minute:"+min+" "+"Second:"+sec);
}
}