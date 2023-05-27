package Exception;

import java.util.Scanner;
import java.util.InputMismatchException;
public class InputmismatchException
{
    public static void main(String[] args)
    {
        try
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("enter integer value");
            int newvalue= scan.nextInt();
            System.out.println(newvalue);

        }
        catch (InputMismatchException imp)
        {
            Scanner scan=new Scanner(System.in);
            System.out.println("we have given input as float integer "+imp);
            System.out.println("enter integer value");
            int newvalue= scan.nextInt();
            System.out.println(newvalue);

        }
        finally {
            System.out.println("thanks for the process");
        }
    }
}
