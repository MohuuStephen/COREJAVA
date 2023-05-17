package Array.workouts;
import java.util.Arrays;
public class program1
{
    public static void main(String[] args)
    {
        int[][] arr={{55,65,75},{11,12,13},{99,98,97}};
        int[] single=new int[arr.length*3];
        int index=0,row=0,column=0;
        for(;column<3;column++,index++)
        {
             single[index]=arr[row][column];
        }
        column--; row++;
            for(;row<=2;row++,index++)
        {
        single[index]=arr[row][column];
        }
            column--;row--;
            for(;column>=0;column--,index++)
            {
                single[index]=arr[row][column];
            }
            column++;row--;
            for (;column>=1;column++,index++)
            {
                single[index]=arr[row][column];
            }

        System.out.println(Arrays.toString(single));
    }
}