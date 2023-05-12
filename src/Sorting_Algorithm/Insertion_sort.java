package Sorting_Algorithm;

import java.util.Arrays;

public class Insertion_sort {

    public  static void InsertionSort(int arr[])
    {
        boolean flag;
        for(int i =0; i<arr.length-1;i++)
        {
           flag = false;
            for(int j = i+1; j>0; j--)
            {
//                Swap
                if(arr[j]<arr[j-1])
                {
                    int temp =  arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp;
                    flag = true;
                }

            }
            if(!flag)
            {
                break;
            }
        }
    }


    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
