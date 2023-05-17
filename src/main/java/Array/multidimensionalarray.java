package Array;

public class multidimensionalarray
{
    public static void main(String[] args)
    {
        int [][] values={{45,55,65},{75,15,25},{35,95,85}};
        for(int row=0;row<3;row++)

            for(int column=0;column<3;column++)
            {
                System.out.println(values[row][column]);
            }
            
        }

    }

