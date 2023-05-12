package com.codewithkunalkushwaha;

public class Linear_search {
    public static int LinearSearch(int arr[], int target)
    {
        if(arr.length ==0)
        {
            return -1;
        }
        for(int index =0; index<arr.length; index++)
        {
            if(arr[index]==target)
            {
                return index;
            }
        }
        return Integer.MAX_VALUE;
    }
    public static void main(String[] args) {

int nums[] ={23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
int target = 199;
        System.out.println(LinearSearch(nums, target));


    }
}
