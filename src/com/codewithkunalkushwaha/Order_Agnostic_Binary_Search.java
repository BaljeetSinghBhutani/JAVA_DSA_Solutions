package com.codewithkunalkushwaha;

import java.util.Collections;

public class Order_Agnostic_Binary_Search {

    public static void main(String[] args) {
        int arr[] = {-18,-12, -4,0, 2,3,  4,15, 16, 18, 22, 45, 89};

//        int arr1[] = {-18,-12, -4,0, 2,3,  4,15, 16, 18, 22, 45, 89};
        int ans =orderAgnosticBinarySearch(arr, 22);
        System.out.println(ans);
    }

    public static int orderAgnosticBinarySearch(int arr[], int target ){
        int start =0;
        int end = arr.length-1;
//        find whether array is sorted or not
        boolean isAsec = arr[start]<arr[end];


        while(start<=end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            if (isAsec){
                if (target < arr[mid]) {
                    end = mid - 1;

                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
        }
            else{
                if (target < arr[mid]) {
                    start= mid + 1;

                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
