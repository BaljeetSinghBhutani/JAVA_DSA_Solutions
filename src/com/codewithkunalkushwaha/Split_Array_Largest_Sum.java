package com.codewithkunalkushwaha;

import java.util.Arrays;

public class Split_Array_Largest_Sum {
    public static int splitArray(int[] nums, int m) {
//         Method -2

        int start = 0;
        int end = 0;
        for(int i =0; i<nums.length; i++)
        {
            start = Math.max(start, nums[i]);
            end+=nums[i];
        }

//         Apply Binary search
        while (start < end) {
            int mid = start + (end - start)/2;
            int sum = 0;
            int pieces = 1;
            for (int num:nums) {
                if(sum + num> mid)
                {
//                     You Cannot add in this subarray we have to make a new one
                    sum= num;
                    pieces++;
                }
                else{
                    sum +=num;
                }
            }
            if(pieces>m)
            {
                start = mid +1;


            }
            else {
                end = mid;
            }
        }


        return end;



//       Method -1 - Will Fail for some of the test cases


//        int arr[] = new int[nums.length-1];
//        int l = 0;
//
//        int i = nums.length-2;
//        int j = nums.length-1;
//
//        while(i>=0){
//            int sum1 =0;
//            int sum2 = 0;
//            for(int k =0; k<=i; k++)
//            {
//                sum1+=nums[k];
//
//            }
//            for(int k =i+1; k<=j; k++)
//            {
//                sum2+=nums[k];
//            }
//            arr[l] = Math.max(sum1, sum2);
//            l++;
//            i--;
//        }
//        Arrays.sort(arr);
//        return arr[0];
//
//    }

    }
    public static void main(String[] args) {

int arr[] = {1, 4, 4};
int m = 2;
     int a = splitArray(arr, m);
        System.out.println(a);
    }
}
