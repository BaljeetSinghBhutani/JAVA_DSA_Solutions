package com.codewithkunalkushwaha;

import java.util.Arrays;

public class Sorted_Matrix {
//     Search in the rows provided , given col is provided
    public static int [] binarySearch(int matrix[][], int rows, int colStart, int colEnd, int target){
        while(colStart<=colEnd){
            int mid = colStart + (colEnd - colStart)/2;
            if(matrix[rows][mid]==target){
                return new int[] {rows, mid};

            }
            if(matrix[rows][mid]<target){
colStart = mid +1;

            }
            if(matrix[rows][mid]>target){

colEnd = mid -1;
            }
        }
return new int [] {-1, -1};
    }
    public static int[] search(int matrix[][] , int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
//         be cautious as matrix may be empty
        if (rows == 1) {
            return binarySearch(matrix, rows, 0, cols - 1, target);
        }

        int rowstart = 0;
        int rowEnd = rows - 1;
        int midCol = (cols) / 2;

        while (rowstart < (rowEnd - 1)) {
            int mid = rowstart + (rowEnd - rowstart) / 2;
            if (matrix[mid][midCol] == target) {
                return new int[]{mid, midCol};

            }
            if (matrix[mid][midCol] < target) {
                rowstart = mid;

            }
            if (matrix[mid][midCol] > target) {
                rowEnd = mid;

            }


        }
// now we have two rows
        if (matrix[rowstart][midCol] == target) {
            return new int[]{rowstart, midCol};
        }
        if(matrix[rowstart +1][midCol]==target)
        {
return new int [] {rowstart+1, midCol};
        }
//        Search in first in half of the array
if(target<=matrix[rowstart][midCol-1])
{
return binarySearch(matrix, rowstart, 0, midCol-1, target);
}


//        Search in second in half of the array
        if(target>=matrix[rowstart][midCol+1] && target <=matrix[rowstart][cols-1])
        {
            return binarySearch(matrix, rowstart, midCol+1, cols-1, target);
        }


//        Search in third in half of the array

        if(target<=matrix[rowstart +1][midCol-1])
        {
            return binarySearch(matrix, rowstart+1, 0, midCol-1, target);
        }


//        Search in fourth in half of the array
   else
        {
            return binarySearch(matrix, rowstart +1, midCol+1, cols-1, target);
        }

    }

    public static void main(String[] args) {
int arr[][] = {
        {1,3, 5, 7},
        {10, 11, 16, 20},
        {23, 30, 34, 60},

};
        System.out.println(Arrays.toString(search(arr,3 )));
//         Time complexity of this is o(log m) + o(log n)

    }
}
