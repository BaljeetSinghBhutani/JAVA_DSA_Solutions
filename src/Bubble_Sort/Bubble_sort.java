package Bubble_Sort;

import java.util.Arrays;

public class Bubble_sort {
   static void bubbleSort(int arr[])
    {
        boolean swap;
        for(int i =0; i<arr.length; i++)
        {
            swap = false;
            for(int j = 1; j<arr.length-i; j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }
            }
            if(!swap)
            {
                break;
            }

        }


    }
    public static void main(String[] args) {
        int arr[] = {3, 1, 5, 4, 2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
