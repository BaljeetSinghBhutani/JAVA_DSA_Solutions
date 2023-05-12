package Sorting_Algorithm;

import java.util.Arrays;

public class Selection_Sort {
    public static void SelectionSort(int arr[])
    {

        int max ;
        int index = 0;

        for(int i =0; i<arr.length; i++)
        {
            max = Integer.MIN_VALUE;
            for(int j = 0; j< arr.length-i; j++)
            {
                if(arr[j]>max)
                {
                    max = arr[j];
                    index =  j;

                }
            }
//            swap

                int temp = max;
                arr[index] = arr[arr.length - i-1];
                arr[arr.length - i-1] = temp;

        }


    }
    public static void main(String[] args) {
int arr [] ={2, -1 };
SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
