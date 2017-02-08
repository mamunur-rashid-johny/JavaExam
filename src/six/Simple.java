package six;

/**
 * Created by ICE-015 on 2/8/2017.
 */
public class Simple
{
    public static void main(String args[])
    {
        AnotherClass cnt = new AnotherClass();
        try
        {
            while(cnt.isAlive())
            {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread's run is over" );
    }
}