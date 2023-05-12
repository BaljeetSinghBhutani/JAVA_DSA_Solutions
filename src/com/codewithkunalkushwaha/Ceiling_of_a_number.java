package com.codewithkunalkushwaha;

public class Ceiling_of_a_number {
//     Ceiling of a number means smallest number greater than or equal to the target
    public static int ceilingOfaNumber(int arr[], int target){
        if(target>arr[arr.length-1])
        {
            return -1;
        }
        int startIndex = 0;
        int endIndex = arr.length-1;

        while(startIndex<=endIndex)
        {
            int mid = (startIndex + endIndex)/2;
            if(arr[mid] == target)
            {
                return arr[mid];
            }
            else  if(arr[mid]<target)
            {
                startIndex = mid +1;
            }
            else {
                endIndex = mid-1;
            }
        }
        return arr[startIndex];
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 9, 14, 16, 18};

int target = 15;
int ans= ceilingOfaNumber(arr, target);
        System.out.println(ans);

    }
}
