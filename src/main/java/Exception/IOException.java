package Exception;

import java.lang.Runtime;
public class IOException
{
    public static void main(String[] args)
    {
        //classname objname=classname.refclassname
        Runtime run=Runtime.getRuntime();
        Process PRO;

        try {
            PRO= run.exec("notepad");
        }
        catch (java.io.IOException io)
        {

        }
        finally {
            System.out.println("thanks");
        }

    }
}
