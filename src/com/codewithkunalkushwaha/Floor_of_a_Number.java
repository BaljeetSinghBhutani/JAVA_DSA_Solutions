package com.codewithkunalkushwaha;

public class Floor_of_a_Number {
//     Floor of a number means find the greatest number which is smaller than or equal to the target
    public static int FloorOfaNumber(int arr[], int target){
        int startIndex = 0;
        int endIndex = arr.length-1;

        while(startIndex<=endIndex)
        {
            int mid = (startIndex + endIndex)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else  if(arr[mid]<target)
            {
                startIndex = mid +1;
            }
            else {
                endIndex = mid-1;
            }
        }
        return endIndex;
    }
    public static void main(String[] args) {

    }
}
