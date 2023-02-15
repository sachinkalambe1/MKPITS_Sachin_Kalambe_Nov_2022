interface one{

void dis();
void absmethod();
}
interface two extends one{

void dis1();
void absmethod1();
}

class three implements two
{

public void dis(){
System.out.println("dis called");
}
public void absmethod(){
System.out.println("absmethod called");
}
public void dis1(){
System.out.println("dis called 1");
}
public void absmethod1(){
System.out.println("absmethod called 1");
}
}

class demo1{
public static void main(String[]args){

three s=new three();
s.dis();
s.absmethod();
s.dis1();
s.absmethod1();
}
}