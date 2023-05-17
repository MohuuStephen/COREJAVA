package inheritance.mutlilevelinheritance;

import java.util.Scanner;

public class class2 extends class3
{
    public static void main(String[] args)
    {
        class2 obj=new class2();
        obj.looping();
        obj.sequence();

    }
    public void looping()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("what is the class topper mark  ?");
        double topper= scan.nextDouble();
        if (topper<490)
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println("your mark is ");
            }
            System.out.println("your class topper mark is 489");
        }
    }

}
