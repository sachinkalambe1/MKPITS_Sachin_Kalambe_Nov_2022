interface one{

void dis();
void absmethod();
}

interface two{

void dis1();
void absmethod1();
}

class three implements one,two{

public void dis(){
int a=1;
System.out.println(a);
}
public void absmethod(){

System.out.println("Abract method Called");
}
public void dis1(){
int b=2;
System.out.println(b);
}
public void absmethod1(){

System.out.println("Abract method Called 2");
}

}
class four{

public static void main(String[]args){
three s=new three();
s.dis();
s.absmethod();
s.dis1();
s.absmethod1();

}
}