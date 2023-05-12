package Sorting_Algorithm;

import java.util.Arrays;

public class Cyclic_SOrt {
    public static void CyclicSort(int arr[])
    {
        int i =0;
        while(i<arr.length-1)
        {
//            Now check if I is at the correct Index or not
            int value = arr[i]-1;
            if(i!=value){
//                swap

                int temp =  arr[i];
                arr[i]=  arr[value];
                arr[value] = temp;

            }

           else
            {
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] ={5, 4, 3, 2, 1};
CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
