package Sorting_Algorithm;

import java.util.Arrays;

public class Bubble_Sort {
//Space Complexity is constant o(1) inplace sorting algorithm
//
    public static void BubbleSort(int arr[])
    {
        boolean flag = false;
        for(int i =0; i<arr.length-1; i++)
        {
            flag =  false;
            for(int j = 1; j<arr.length-i;j++)
            {
              if(arr[j]<arr[j-1])
                {
//                   swap
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1] = temp;
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

        int arr[]= {-5, 4, 3,-2 , 1};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
