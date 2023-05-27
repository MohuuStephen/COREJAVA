package Exception;

import java.util.Scanner;

public class Finitechance
{
    private String content="the throw keyword is used to create a custom error.Throw is followed by instance of exception class";
    public void Limited(int attempts)
    {
        Scanner scan=new Scanner(System.in);
        try
        {
            System.out.println("what is your first index value....? ");
            int first= scan.nextInt();
            System.out.println("what is your second index value...?");
            int second= scan.nextInt();
            System.out.println(content.substring(first,second));

        }
        catch (StringIndexOutOfBoundsException siobe)
        {
            System.out.println(siobe+"out of range so please tell less than"+content.length());
            if (attempts<10)
            {
                attempts++;
                System.out.println("your chance is"+attempts);
                Limited(attempts);

            }
            else {
                System.out.println("your value is wrong,max attempt is over ");
            }
        }
    }

    public static void main(String[] args)
    {
        Finitechance chance=new Finitechance();
        chance.Limited(1);

    }
}
