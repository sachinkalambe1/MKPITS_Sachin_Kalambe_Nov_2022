public class LogRunnable implements Runnable
{

    public LogRunnable()
    {
        Thread thread = new Thread(this); // this escapes
        thread.start();
    }

    @Override
    public void run()
    {
        System.out.println("Started...");
    }
}
class loge{
public static void main(String[]args)
{
LogRunnable thread=new LogRunnable ();
}
}