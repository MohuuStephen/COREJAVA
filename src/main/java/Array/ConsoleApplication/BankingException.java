package Array.ConsoleApplication;

public class BankingException extends Exception
{
    public BankingException()
    {
        super("something went wrong,memory is not available,process is not matching");
    }
}
