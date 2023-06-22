package Array.ConsoleApplication;

public class Mainclass
{
    public static void main(String[] args)
    {
     //   ExecutionBankingApplication execute=new ExecutionBankingApplication();

        ColletionProcess execute=new ColletionProcess();

        Thread th1=new Thread(execute,"Mohanavel");
        Thread th2=new Thread(execute,"stephen");
        Thread th3=new Thread(execute,"Madhan");

        th1.start();
        th2.start();
        th3.start();


    }
}
