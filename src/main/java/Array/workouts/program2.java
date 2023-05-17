package Array.workouts;
import java.util.Arrays;
public class program2
{
    public static void main(String[] args)
    {
        int[][]arr={{12,34,56,78,67},{12,32,65,89,78},{99,9,91,24,31},{77,88,98,22,33}};
        int[]single=new int[20];
        int index=0,row=0,col=0;
        for (;col<6;col++,index++);
        {
            System.out.println( single[index]=arr[row][col]);
        }
        col--;row++;
        for (;row<=1;index++);
        {
            System.out.println(single[index]=arr[row][col]);
        }
        col--;
        for (;col>=0;col--,index++);
        {
            System.out.println( single[index]=arr[row][col]);
        }
        col++;row++;
        for (;row<=3;row++,index++);
        {
            System.out.println(single[index]=arr[row][col]);
        }
        row--;col++;
        for (;col<=1;col++,index++);
        {
            System.out.println( single[index]=arr[row][col]);
        }
        row--;
        for (;row<=2;row++,index++);
        {
            System.out.println(single[index]=arr[row][col]);
        }
        col++;row++;
        for (; col<6;col++,index++);
        {
            System.out.println( single[index]=arr[row][col]);
        }
        col--;row++;
        for (;row<=3;row++,index++);
        {
            System.out.println(single[index]=arr[row][col]);
        }
        row--;col--;
        for (;col>=2;col++,index++);
        {
            System.out.println( single[index]=arr[row][col]);
        }

    }
}
