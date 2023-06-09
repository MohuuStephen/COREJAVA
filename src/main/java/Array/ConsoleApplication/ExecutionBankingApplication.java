package Array.ConsoleApplication;

import java.util.Scanner;

public class ExecutionBankingApplication implements BankingApplicationPerformance
{

    BankingApplication [] banking= new BankingApplication[4];

    public ExecutionBankingApplication()
    {
        banking[0]=new BankingApplication("Mohan",9876545666l,"veerapandi",8765456789098l,9646854567l,"salem" );
        banking[1]=new BankingApplication("satheesh",98765433466l,"kondalampatty",76543234568l,6345689741l,"salem" );
        banking[2]=new BankingApplication("Madhan",765423456567l,"seelanayakanpaaty",98765434567l,8675423667l,"salem");
        banking[3]=new BankingApplication("karthi",8765432345689l,"veerapandi",987654234567l,7653257858l,"salem");

    }

    public static void main(String[] args)
    {
        ExecutionBankingApplication obj=new ExecutionBankingApplication();
        Scanner scan=new Scanner(System.in);
        do
        {
            System.out.println("Welcome Sir");
            System.out.println("Tell Me! Which process you want to doing"+"\n1.adddetails\n2.listalldetails\n3.updatedetails\n4.deleteadetails\n5.searchadetails\n6.sortingdetails ");
            int values= scan.nextInt();
            switch (values)
            {
                case 1:
                    System.out.println("adding a new holder name"+"\nAccountHolderName\tAccountNumber\tBranch\tPanNumber\tMobileNumber\tAddress");
                    BankingApplication name=new BankingApplication(scan.next(),scan.nextLong(),scan.next(),scan.nextLong(),scan.nextLong(),scan.next());
                    obj.adddetails(name);
                    break;
                case 2:
                    System.out.println("Listing all the values");
                    obj.listalldetails();
                    break;
                case 3:
                    System.out.println("which kind of value you are going to update ?");
                    String changename=scan.next();
                    obj.updatedetails(changename);
                    break;
                case 4:
                    System.out.println("which Person are going to close their account in this branch");
                    String candidate=scan.next();
                    obj.deleteadetails(candidate);
                    break;
                case 5:
                    System.out.println("who details do you want ?");
                    String person= scan.next();
                    obj.searchadetails(person);
                    break;
                case 6:
                    obj.sortingdetails();

                default:return;

            }

        }while (true);

    }


    @Override
    public String adddetails(BankingApplication app)
    {
        Scanner scan=new Scanner(System.in);
        try{
        for (int i=0;i<banking.length;i++)
        {
            if (banking[i]==null)
            {
                banking[i]=app;
                return app.getAccountHolderName()+"has been added in our studentdetails";
            }

        }
        throw new BankingException();
        }
        catch (BankingException be)
        {
            System.out.println(be+"my memory is full,so any one value you want to delete,otherwise there is no chance for add a new details");
            for (BankingApplication BA:banking)
            {
                System.out.println(BA.getAccountHolderName());
            }
            System.out.println("which name you want to delete");
            String holdname= scan.next();
            deleteadetails(holdname);
            adddetails(app);
        }
        return app.getAccountHolderName()+"has been addd successfully";
    }


    @Override
    public void listalldetails()
    {
        for (BankingApplication customers:banking)
        {
            System.out.println(customers);
        }

    }

    @Override
    public String updatedetails(String AccountHolderName)
    {
        Scanner scan=new Scanner(System.in);

        for (int ind=0;ind< banking.length;ind++)
        {
            if (banking[ind].getAccountHolderName().equalsIgnoreCase(AccountHolderName))
            {
                System.out.println(banking[ind]);
                System.out.println("which data you want to updte....?");
                String usage=scan.next();
                switch (usage)
                {
                    case "AccountHolderName":
                        System.out.println("you are selected AccountHolderName \nplease type your Re-AccountHolderName");
                        String newvalue= scan.next();
                        banking[ind].setAccountHolderName(newvalue);
                        return null;
                    case "Branch":
                        System.out.println("you are selected Branch Details \nplease type your transfer location");
                        String newvalue1=scan.next();
                        banking[ind].setBranch(newvalue1);
                        return null;
                    case "MobileNumber":
                        System.out.println("you are selected MobileNumber \nplease type your changed MobileNumber");
                        long newvalue2= scan.nextLong();
                        banking[ind].setMobileNumber(newvalue2);
                        return null;

                }

            }
        }
        return AccountHolderName;
    }

    @Override
    public String deleteadetails(String AccountHolderName)
    {
        Scanner scan=new Scanner(System.in);
        try
        {
            for (int index = 0; index < banking.length; index++)
            {
                if (banking[index].getAccountHolderName().equalsIgnoreCase(AccountHolderName))
                {
                    banking[index] = null;
                    return AccountHolderName + "has been deleted";
                }
            }
            throw new BankingException();
        }
        catch (BankingException be)
        {
            System.out.println(be+"sorry your input is not match with our details,please give correct name");
            System.out.println("which name you want to delete");
            String name= scan.next();
            for (BankingApplication BA:banking)
            {
                System.out.println(BA.getAccountHolderName());
            }
        }
        return AccountHolderName+"has been deleted successfully";
    }

    @Override
    public String searchadetails(String AccountHolderName)
    {
        for (int pos=0;pos< banking.length;pos++)
        {
            if (banking[pos].getAccountHolderName().equalsIgnoreCase(AccountHolderName))
            {
                System.out.println(banking[pos]);
                break;
            }
        }
        return AccountHolderName;
    }

    @Override
    public void sortingdetails()
    {



    }
}
