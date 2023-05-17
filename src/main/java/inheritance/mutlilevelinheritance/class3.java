package inheritance.mutlilevelinheritance;

import java.util.Scanner;

public class class3
{
    public void sequence() {
        Scanner scan = new Scanner(System.in);
        System.out.println("what is the height of world longest building");
        long height = scan.nextLong();
        System.out.println(height);
        int length = (int) height;
        System.out.println(length);
    }

    public static void main(String[] args)
    {
        class3 obje=new class3();
        obje.sequence();


    }

}
