package Exception;

import java.util.Scanner;

public class infinitechance
{
    private String NOTES="The Throw Keyword is used to create a custom error.throw is followed by instance of exception class ";
    public static void main(String[] args)
    {
        infinitechance chance=new infinitechance();
        chance.unlimited();


    }
    public void unlimited()
    {
        Scanner scan=new Scanner(System.in);
        try {
            System.out.println("what is your first index value..?");
            int first = scan.nextInt();
            System.out.println("what is your second index value..?");
            int second = scan.nextInt();
            System.out.println(NOTES.substring(first,second));

        }
        catch (StringIndexOutOfBoundsException siobe)
        {
            System.out.println("your starting value is 0 to ending value"+(NOTES.length()-1));
            System.out.println(siobe);
            unlimited();
        }
    }
}
