package inheritance.mutlilevelinheritance;

import java.util.Scanner;

public class class1 extends class2
{
    public void math()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("what is the score of last IPL match  ?");
        double score=scan.nextDouble();
        int run=(int)score;
        System.out.println(run);
    }
    public static void main(String[] args)
    {
        class1 obj2=new class1();
        obj2.math();
        obj2.looping();
    }
}
