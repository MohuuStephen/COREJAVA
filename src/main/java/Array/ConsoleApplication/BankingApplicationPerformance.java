package Array.ConsoleApplication;

public interface BankingApplicationPerformance
{
    public String adddetails(BankingApplication app);
    public void listalldetails();
    public String updatedetails(String AccountHolderName);
    public String deleteadetails(String AccountHolderName);
    public String searchadetails(String AccountHolderName);
    public void sortingdetails();
}
