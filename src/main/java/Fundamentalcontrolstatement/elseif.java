package Fundamentalcontrolstatement;

public class elseif {
    public static void main(String[] args) {
        int tamilmark = 96;
        int englishmark = 84;
        int mathsmark = 92;
        int sciencemark = 99;
        int socialmark = 98;

        int mytotalmark = 477;

        if (mytotalmark < 470)
        {
            System.out.println("your are eligible for class-B");
        }
        else if (mytotalmark > 490)
        {
            System.out.println("your are eligible for class-A");
        }
        else
        {
            System.out.println("u are not eligible");
        }

    }

}



