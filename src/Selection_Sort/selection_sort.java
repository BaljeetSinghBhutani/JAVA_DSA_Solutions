package Selection_Sort;

import java.util.Arrays;

public class selection_sort {
    public static void SelectionSort(int arr[])
    {
        int max;
        int index  = 0;
        int k = arr.length-1;
        for(int i =0; i<arr.length;i++)
        {
            max = Integer.MIN_VALUE;
            for(int j =0; j <arr.length-i; j++)
            {
if(arr[j]>max)
{
    max = arr[j];
    index = j;
}
            }
            int temp  = arr[k];
            arr[k] = arr[index];
            arr[index] = temp;
k--;

        }
    }
    public static void main(String[] args) {
int arr[] = {4, 3, 1, 2, 5};
SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
