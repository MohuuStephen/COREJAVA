package Fundamentalvariables;

public class GlobalVariable
{
    long mobileno=8765445567l;

    public static void main(String[] args)
    {
        float capacity=89.4f;
        System.out.println("what is the watertank capacity....? "+capacity);
        GlobalVariable data=new GlobalVariable();
        data.clarity();
        clarity();
    }
    public static void clarity()
    {
        System.out.println("welcome to India");
        System.out.println("what is the mobileno");
    }
    static
    {
        System.out.println("Thankyou");
    }
}
