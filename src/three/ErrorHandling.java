package three;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by ICE-015 on 2/8/2017.
 */
public class ErrorHandling
{
    private static double a,b,c;
    private static Scanner input=new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Enter First Number:");
        a=input.nextDouble();
        System.out.println("Enter Second Number:");
        b=input.nextDouble();
        try {
            c=a/b;
            System.out.println("The Division of "+a+" and "+b+" is "+c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Program is stopping");

        }
    }
}
