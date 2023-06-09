package Collection;

import lombok.AllArgsConstructor;

import java.util.Iterator;
import java.util.TreeSet;

public class Demosets
{
    public static void main(String[] args)
    {
        TreeSet<bankdetails> obj=new TreeSet<bankdetails>();
        obj.add(new bankdetails("Mohanavel",2019,654345678,"veerapandi"));
        bankdetails no1=new bankdetails("karthi",2020,876434567,"musiri");
        obj.add(new bankdetails("Madhan",2021,765434567,"thammampatti"));
        bankdetails no2=new bankdetails("Thiru",2015,987653456,"karur");
        obj.add(no1);
        obj.add(no2);

        Iterator it= obj.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }



    }

}

@AllArgsConstructor
class bankdetails implements Comparable<bankdetails>
{
    String Holdername;
    int AccountOpeningYear;
    long AccountNumber;
    String Branch;
    @Override
    public String toString() {
        return "bankdetails{" +
                "Holdername='" + Holdername + '\'' +
                ", AccountOpeningYear=" + AccountOpeningYear +
                ", AccountNumber=" + AccountNumber +
                ", Branch='" + Branch + '\'' +
                '}';
    }





    @Override
    public int compareTo(bankdetails o) {
        return this.Holdername.compareTo(o.Holdername);
    }
}