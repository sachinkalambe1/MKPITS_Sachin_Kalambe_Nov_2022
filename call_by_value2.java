class sam{
    void ask(int val){
        int result=val+10;
        System.out.println("value in called function :"+result);
    }
}
public class call_by_value2 {
  public static void main(String []args){
      int val=20;
      System.out.println("value before calling function :"+val);
      sam s=new sam();
s.ask(val);
      System.out.println("value after calling function : :"+val);
  }
}
