package Fundamentalvariables;


import java.util.Scanner;

public class standard
{
    public void tiles()
    {
        Scanner SCANS=new Scanner(System.in);
        System.out.println("how many tiles do you want");
        int value=SCANS.nextInt();
        System.out.println("customer requirement.."+value);

    }
    public void typecasting()
    {
        double GPA=78;
        float percentage=(float) GPA;
        System.out.println("what is the highest percentage of the current acedemic year:"+percentage);
    }

    public static void main(String[] args)
    {
        standard sequence=new standard();
        sequence.tiles();
        sequence.typecasting();
    }
}
