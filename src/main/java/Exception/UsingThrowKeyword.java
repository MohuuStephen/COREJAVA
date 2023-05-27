package Exception;

public class UsingThrowKeyword
{
    public static void main(String[] args)
    {
        UsingThrowKeyword word=new UsingThrowKeyword();
        try
        {
           word.TrytoThrow();
        }
        catch (NullPointerException npe)
        {
            System.out.println("I got second time null pointer exception");
        }


        try
        {
            int a=125;
            int b=0;
            int c=a/b;
            System.out.println(c);
            throw new ArithmeticException();
        }
        catch (ArithmeticException ae)
        {
            System.out.println(ae);
        }
    }
    public void TrytoThrow()
    {
        try
        {
            throw new NullPointerException();
        }
        catch (NullPointerException npe)
        {
            System.out.println("i got first time null pointer exception");
            throw npe;
        }
    }
}
