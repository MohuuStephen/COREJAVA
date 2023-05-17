package FundamentalJava;

import java.util.Scanner;

public class Scannerclass
{
    public static void main(String[] args)
    {
        Scanner scans=new Scanner(System.in);//
        System.out.println("what is your name?");
        String myname= scans.next();
        System.out.println("what is your name?");
        String bankname=scans.next();
        System.out.println("mention your bankname");
        String city= scans.next();
        System.out.println("branchname...");
        long accno= scans.nextLong();
        System.out.println("your accono..");
        double ifsc= scans.nextDouble();
        System.out.println("my ifsc code is:");
        long number= scans.nextLong();
        System.out.println("my mobileno...");

        System.out.println("what is the candidate name:"+myname+"bank name:"+bankname+"branch:"+city+"candidate account number-"+accno+"ifsc code-"+ifsc+"candidate mobile number-"+number);
    }
}
