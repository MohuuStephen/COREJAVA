package Fundamentalcontrolstatement;

import java.util.Scanner;

public class switchstatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("value");
        int age = scan.nextInt();

        switch (age)
        {
            case 15:
                System.out.println("U have completed 10th");
                break;
            case 17:
                System.out.println("u have completed 12th");
                break;
            case 21:
                System.out.println("u have completed degree");
                break; 
            default:
                System.out.println("you have completed ur graduation");

        }
    }
}