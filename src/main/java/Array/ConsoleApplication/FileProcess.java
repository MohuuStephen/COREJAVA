package Array.ConsoleApplication;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FileProcess implements BankingApplicationPerformance,Runnable
{

    File myfile=new File("C:\\Users\\Jana\\IdeaProjects\\COREJAVA\\src\\main\\java\\Array\\ConsoleApplication\\Bankingdetails.doc");

   // ArrayList<BankingApplication> bankingdetails=new ArrayList<BankingApplication>();

    ArrayList<BankingApplication> bankingdetails=null;
    public FileProcess()
    {
        System.out.println("welcome to fileexecution");
        bankingdetails=new ArrayList<BankingApplication>();
    }

    public void writing() throws IOException
    {
        FileOutputStream fos=new FileOutputStream(myfile);
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        oos.writeObject(bankingdetails);

        oos.close();
        fos.close();
    }

    public void reading() throws IOException, ClassNotFoundException
    {
        FileInputStream fis=new FileInputStream(myfile);
        ObjectInputStream ois=new ObjectInputStream(fis);

        bankingdetails=(ArrayList<BankingApplication>) ois.readObject();

        ois.close();
        fis.close();
    }


    @Override
    public String adddetails(BankingApplication app)
    {
        try {
            reading();
            bankingdetails.add(app);
            writing();
        }
        catch (EOFException eofException)
        {
            System.out.println(eofException);
            bankingdetails.add(app);
            try {
                writing();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return app.getAccountHolderName()+"has been added successfully";
    }

    @Override
    public void listalldetails()
    {
        try {
            reading();
            Iterator<BankingApplication>it=bankingdetails.iterator();
            while (it.hasNext())
            {
                System.out.println(it.next());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

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
    synchronized public void run()
    {
        FileProcess execute=new FileProcess();
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
}
