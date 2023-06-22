package Array.ConsoleApplication;

import java.util.*;

public class ColletionProcess implements BankingApplicationPerformance,Runnable
{
    ArrayList<BankingApplication> bank=new ArrayList<BankingApplication>();
    public ColletionProcess()
    {
        bank.add(new BankingApplication("Mohuu",7654567755l,"salem",9835675677l,6349785603l,"veerapandi"));
        bank.add(new BankingApplication("stephen",8765434567l,"trichy",7654567899l,9476843210l,"puthur"));
        bank.add(new BankingApplication("Joseph",543234565l,"thammapatti",98765434576l,7402259392l,"sathur"));

    }
    synchronized public void run()
    {
        ExecutionBankingApplication execute=new ExecutionBankingApplication();
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome Sir");
        System.out.println("Tell Me! Which process you want to doing"+"\n1.adddetails\n2.listalldetails\n3.updatedetails\n4.deleteadetails\n5.searchadetails\n6.sortingdetails ");
        int values= scan.nextInt();
        switch (values)
        {
            case 1:
                System.out.println("adding a new holder name"+"\nAccountHolderName\tAccountNumber\tBranch\tPanNumber\tMobileNumber\tAddress");
                BankingApplication name=new BankingApplication(scan.next(),scan.nextLong(),scan.next(),scan.nextLong(),scan.nextLong(),scan.next());
                execute.adddetails(name);
                break;
            case 2:
                System.out.println("Listing all the values");
                execute.listalldetails();
                break;
            case 3:
                System.out.println("which kind of value you are going to update ?");
                String changename=scan.next();
                execute.updatedetails(changename);
                break;
            case 4:
                System.out.println("which Person are going to close their account in this branch");
                String candidate=scan.next();
                execute.deleteadetails(candidate);
                break;
            case 5:
                System.out.println("who details do you want ?");
                String person= scan.next();
                execute.searchadetails(person);
                break;
            case 6:
                execute.sortingdetails();

            default:return;

        }

    }
    @Override
    public String adddetails(BankingApplication app1)
    {
        bank.add(app1);
        return app1.getAccountHolderName()+"has been added successfully";
    }

    @Override
    public void listalldetails()
    {
        Iterator<BankingApplication> it=bank.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }

    @Override
    public String updatedetails(String AccountHolderName)
    {
        return null;
    }

    @Override
    public String deleteadetails(String AccountHolderName)
    {
        for (int i=0;i<bank.size();i++)
        {
            if (bank.get(i).getAccountHolderName().equalsIgnoreCase(AccountHolderName))
            {
                bank.remove(bank.get(i));
                System.out.println(AccountHolderName+"has been deleted successfully");
            }
        }
        return AccountHolderName;
    }

    @Override
    public String searchadetails(String AccountHolderName)
    {
        return null;
    }

    @Override
    public void sortingdetails()
    {


    }
}
