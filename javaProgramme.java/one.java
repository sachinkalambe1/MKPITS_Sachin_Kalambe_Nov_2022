interface one1{

void dis();
void absmethod();
}


class two implements one1{

public void dis(){
int a=1;
System.out.println(a);
}
public void absmethod(){

System.out.println("Abract method Called");
}


}
class one{

public static void main(String[]args){
two s=new two();
s.dis();
s.absmethod();


}
}