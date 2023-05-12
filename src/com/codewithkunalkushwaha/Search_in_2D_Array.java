package com.codewithkunalkushwaha;

import java.util.Arrays;

public class Search_in_2D_Array {
    public static void main(String[] args) {
        int arr[][] = { { 23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12},
        };
        int target = 56;
        int ans  = max(arr, target);
        System.out.println(ans);
     }

     public static int max(int arr[][], int target)
     {
         int max = arr[0][0];
         for (int[] ints : arr)
             for (int anInt : ints) {
                 if (anInt > max) {
                     max = anInt;
                 }
             }
         return max;
     }

}
