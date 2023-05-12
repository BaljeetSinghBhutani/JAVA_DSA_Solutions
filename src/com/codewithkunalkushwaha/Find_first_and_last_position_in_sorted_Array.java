package com.codewithkunalkushwaha;

import java.util.Arrays;

public class Find_first_and_last_position_in_sorted_Array {
// Method -1
    public static int[] searchRange(int[] nums, int target) {

        int startIndex =0 ;
        int EndIndex =  nums.length-1;
        int mid;
        int i =0;
        int j =-2;
//        int arr[] = {-1, -1};

        while(startIndex<= EndIndex)
        {
            mid = (startIndex + EndIndex)/2;
          if(target == nums[mid])
          {
               i = mid;
               j = mid;

              while(i< nums.length && nums[i]==target){
                  i++;

              }
              while(j>=0 && nums[j]==target)
              {
                  j--;

              }
              break;
          }
          else if(target>nums[mid])
          {
              startIndex =  mid+1;
          }
          else{
              EndIndex = mid-1;
          }

        }

int arr[] = new int[2];
        j++;
        i--;

        arr[0] = j;
        arr[1] =  i;

        return arr;
    }


    public static void main(String[] args) {
int arr[]= {};
int ans[] =searchRange(arr, 0);

        System.out.println(Arrays.toString(ans));

    }
}
