package com.codewithkunalkushwaha;

public class Infinite_Array {
    public static int  binarySearch(int arr[], int target, int startIndex, int EndIndex)
    {
        while(startIndex<=EndIndex)
        {
//            int mid =  (startIndex + EndIndex)/2;
//            - might happen that int exceeds the size limit

            int mid = startIndex + (EndIndex - startIndex)/2;
            if(target==arr[mid]){
                return mid;
            }

            else if(target>arr[mid])
            {
                startIndex = mid +1;
            }
            else{
                EndIndex = mid- 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }
    public static  int ans(int arr[], int target)
    {
        int start = 0;
        int end = 1;

        while(target>arr[end])
        {
            int newstart= end +1;
            end = end + 2 *(end - start +1);
            start = newstart;

        }
        return binarySearch(arr, target, start, end);
    }
}













