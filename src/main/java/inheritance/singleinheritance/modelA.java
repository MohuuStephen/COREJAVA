package inheritance.singleinheritance;

import java.util.Scanner;

public class modelA
{
    double cuttoff=567;

    public void scoring()
    {
        Scanner SCANS=new Scanner(System.in);
        System.out.println("how will be eligible to study MBBS in MMC  ?");
        double overallcuttoff=SCANS.nextDouble();
            if ((overallcuttoff)==(cuttoff))
            {
                System.out.println("you have great opportunity to start your career in MMC");
                return;
            }


    }

    public static void main(String[] args)
    {


    }
}
