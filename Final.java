interface one{

void dis();
void absmethod();
}
class two{

void dis1(){
int a=1;
System.out.println(a);
}
void absmethod1(){

System.out.println("Abract method Called");
}}
class three extends two implements one
{
public void dis(){

System.out.println("Display called");
}
public void absmethod()
{

System.out.println("ABS Called");
}
}

class Final{

public static void main(String[]args)
{
three s=new three();
s.dis();
s.absmethod();
s.dis1();
s.absmethod1();
}
}