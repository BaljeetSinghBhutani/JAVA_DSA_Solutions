package com.codewithkunalkushwaha;

public class Search_in_Rotated_Sorted_Array {
    public static int search(int[] nums, int target) {


        int pivot = findPivot(nums);
        int a = 0;
        if (pivot == -1) {
//     just do normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }
if(nums[pivot] ==target)
{
    return pivot;
}
if(target>=nums[0]) {
    return binarySearch(nums, target, 0, pivot - 1);
}
else
        {
          return binarySearch(nums, target,pivot+1, nums.length-1) ;
        }

    }



    public static  int binarySearch(int arr[],int target, int start, int end)
    {

        while(start<=end)
        {
            int mid = start + (end - start)/2;
            if(target<arr[mid])
            {
                end = mid -1;

            }
            else if(target>arr[mid])
            {
                start = mid +1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static int findPivot(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = start + (end - start)/2;
//             4 cases
//            Case -1
if(mid <end && arr[mid]>arr[mid +1])
{
    return mid;
}
//           Case -2
            if(mid >start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
//             Case - 3
            if(arr[start] >=arr[mid])
            {
                end = mid -1;
            }
//             Case - 4
           else
            {
                start = mid +1;
            }
        }
        return -1;
    }

    public static int findPivotWithDuplicateElement(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = start + (end - start)/2;
//             4 cases
//            Case -1
            if(mid <end && arr[mid]>arr[mid +1])
            {
                return mid;
            }
//           Case -2
            if(mid >start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
//             Case - 3
//            if the elements at the middle,start ans end are equal then just skip the duplicates
            if(arr[mid]==arr[start] && arr[mid] == arr[end]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                } else {
                    start++;
                }
                if (arr[end - 1] > arr[end]) {
                    return end - 1;
                }

                end--;
            }
                else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid]>arr[end])
            {
                start= mid +1;
            }
                else{
                    end = mid -1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
int nums[] = {2, 9, 2, 2, 2};
int a = findPivot(nums);
int b = search(nums, 2);
        System.out.println(a);
        System.out.println(b);
    }
}
