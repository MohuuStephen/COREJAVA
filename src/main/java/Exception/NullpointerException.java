package Exception;

public class NullpointerException
{
    public static void main(String[] args)
    {
        try
        {
            String a = null;
            System.out.println(a.length());
        }
        catch (NullPointerException npe)
        {
            System.out.println(npe);
        }
        finally
        {
            System.out.println("bye....");
        }

    }
}
