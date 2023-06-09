package Collection;

import java.util.LinkedList;

public class DemoLinkedList
{
    public static void main(String[] args)
    {
        LinkedList list1=new LinkedList();

        list1.add("Mohanavel");
        list1.add(23);
        list1.add("civil engineering");
        list1.add(7.9);
        list1.add(true);
        list1.addFirst('v');
        list1.set(3,8.5);
        list1.add(1,"shanmugavelavan");
        list1.remove(4);

        System.out.println(list1);


















    }
}
