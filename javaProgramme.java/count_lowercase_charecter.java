// count lower case latter in giver string

 import java.util.*;

  class count_lowercase_charecter{

  public static void main(String [] args){

	  String s="abddE";
	  int count=0;
	  for(int i=0;i<s.length();i++){

		  char c=s.charAt(i);

		  if(Character.isLowerCase(c)){
		  count++;


		  }
}
System.out.println( "lowercase letter is : "+count);

  }
}
