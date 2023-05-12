package com.codewithkunalkushwaha;

import java.util.Arrays;

public class Maximun_value_of_an_array {
    public static void main(String[] args) {

        int arr[] = {1, 3, 23, 9, 18, 56};
        rev(arr);
    }

    static void rev(int arr[]){
     int start =0;
     int end = arr.length-1;
     while (start<end){
         int temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;
         start++;
         end --;

     }
        System.out.println(Arrays.toString(arr));

    }
}