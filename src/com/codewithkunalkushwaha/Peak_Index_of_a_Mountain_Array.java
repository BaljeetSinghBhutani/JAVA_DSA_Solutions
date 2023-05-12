package com.codewithkunalkushwaha;

public class Peak_Index_of_a_Mountain_Array {
    public  static  int peakIndexInMountainArray(int[] nums) {

//        Method -2
        int startIndex = 0;
        int endIndex = nums.length-1;
        while(startIndex<endIndex)
        {
            int mid = startIndex + (endIndex - startIndex)/2;

            if(nums[mid]>nums[mid+1])
            {
                endIndex = mid;
            }
           else  if(nums[mid]<nums[mid+1])
            {
              startIndex = mid +1;
            }
        }





return endIndex;








//        Method -1
//        int startIndex = 0;
//        int EndIndex = nums.length - 1;
//
//
//        while (startIndex <= EndIndex) {
//            int mid = (startIndex + EndIndex) / 2;
//            if (mid - 1 >= 0 && mid + 1 <= nums.length - 1 && nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]){
//                return mid;
//        }
//            else if (mid +1 <=nums.length-1 && nums[mid] < nums[mid+1])
//            {
//                startIndex  = mid +1;
//
//            }
//else if(mid -1 >=0&& nums[mid]<nums[mid-1]){
//    EndIndex = mid -1;
//            }
//        }
//        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {0,10,  5, 2};
        System.out.println(peakIndexInMountainArray(arr));


    }
}
