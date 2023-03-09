abstract class animal{
  public   abstract void sound();
}
class dog extends animal{

    @Override
   public void sound() {
        System.out.println("dogs are too good");
    }
}

class lion extends animal{

    @Override
    public void sound() {
        System.out.println("lion is rour");
    }
}


public class Abstract_class{

    public static void main(String[] args) {
        dog obj = new dog();
        obj.sound();
    }
        }
