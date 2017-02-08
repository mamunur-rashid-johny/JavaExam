package two;

/**
 * Created by ICE-015 on 2/8/2017.
 */
public class Test
{
    public static void main(String args[])
    {
        TwoWheeler tw=new TwoWheeler();
        FourWheeler fw=new FourWheeler();
        tw.start();
        tw.stop();
        fw.start();
        fw.stop();
    }
}
