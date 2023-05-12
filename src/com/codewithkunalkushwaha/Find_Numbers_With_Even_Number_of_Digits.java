package com.codewithkunalkushwaha;

public class Find_Numbers_With_Even_Number_of_Digits {

    public static int findNumbers(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length; i++){
            int element = nums[i];
            if(element <0){
                element = -1 * element;
            }
            int count1 = 0;
//            while(element >0){
//            element = element/10;
//                count1++;
//            }
           count1 = (int)Math.log10(element) + 1;
if(count1%2 ==0 )
{
    count++;
}

        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {555,901, 482, 1771};
 int a = findNumbers(arr);
        System.out.println(a);
    }
}
