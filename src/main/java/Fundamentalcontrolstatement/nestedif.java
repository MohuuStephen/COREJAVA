package Fundamentalcontrolstatement;

public class nestedif {
    public static void main(String[] args) {
        int age =18;
        int weight=100;
        if(age>18)
        {
            if(weight>100)
            {
                System.out.println("valid");
            }
            else {
                System.out.println("Not vaild");
            }
        }
        else {
            System.out.println("Not Eligible");
        }
    }
}
