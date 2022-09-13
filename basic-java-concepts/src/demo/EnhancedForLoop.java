package demo;

import java.util.Arrays;

public class EnhancedForLoop
{
    public static void main(String[] args)
    {
        int[] array = {1,2,3,4};

        for (int index = 0;index < array.length;index++)
        {
            System.out.print(array[index]);
        }
        System.out.println();


        // enhanced for loop for 1D array
        for (int value:array)
        {
            System.out.print(value);
        }
        System.out.println();
        System.out.println();

        // enhanced for loop for 2D array
        int[][] array_2d =
                {
                        {1,2,3,4},
                        {5,6},
                        {7,8,9,10,11,12}
                };

        for(int[] arrays :array_2d)
        {
            System.out.println(arrays);     // this will fetch the values from array_2d
            System.out.println(Arrays.toString(arrays));     // this will fetch the values from array_2d
            for(int elements:arrays)
            {
                System.out.println(elements);       // this will fetch the values from arrays
            }

        }

    }

}