package com.codewithkunalkushwaha;

public class Rotation_in_sorted_Array {
    public static int findKRotation(int arr[], int n) {

    return findPivot(arr) + 1;
     }
    public static int findPivot(int arr[])
    {
        int startIndex = 0;
        int EndIndex = arr.length-1;

        while (startIndex<= EndIndex)
        {
            int  mid = startIndex + (EndIndex - startIndex)/2;

//             case-1
            if(mid <EndIndex && arr[mid]>arr[mid+1])
            {
                return mid ;
            }
//             case -2
            if(mid >0 && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
//             case -3
            if(arr[startIndex]>=arr[mid])
            {
                EndIndex = mid -1;
            }
//             case -4
          else{
                startIndex = mid +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
int arr[] = {4, 5,6, 7, 0, 1,2 };
        System.out.println(findKRotation(arr,arr.length));
    }
}
