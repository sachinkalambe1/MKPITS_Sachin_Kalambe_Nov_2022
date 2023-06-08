class value{
    void sam(int x,int y){
        System.out.println(x);
        System.out.println(y);
    }

}

public class call_by_value {
    public static void main(String[]args){
        value v=new value();
        v.sam(10,50);
    }
}
