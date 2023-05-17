package Array.ConsoleApplication;

public class ExecutionBankingApplication implements BankingApplicationPerformance
{

    BankingApplication [] banking= new BankingApplication[10];

    public ExecutionBankingApplication()
    {
        banking[0]=new BankingApplication("Mohan",9876545666l,"veerapandi",8765456789098l,9646854567l,"salem" );
        banking[1]=new BankingApplication("satheesh",98765433466l,"kondalampatty",76543234568l,6345689741l,"salem" );
    }
    @Override
    public String adddetails(BankingApplication Banking)
    {
        return null;
    }

    @Override
    public void listalldetails()
    {

    }

    @Override
    public String updatedetails(String AccountHolderName) {
        return null;
    }

    @Override
    public String deleteadetails(String AccountHolderName) {
        return null;
    }

    @Override
    public String searchadetails(String AccountHolderName) {
        return null;
    }

    @Override
    public void sortingdetails() {

    }
}
