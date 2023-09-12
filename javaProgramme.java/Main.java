//Lambda Expression Prpgram

interface shape{
void calArea(int l,int b);
}

class Main{
public static void main(String[]args){
shape s=(l,b)->System.out.println("Area OF Rectangle :"+(l*b));
s.calArea(10,20);
}
}