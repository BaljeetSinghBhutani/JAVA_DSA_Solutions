package com.codewithkunalkushwaha;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimension_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int [][] arr = new int [3][3];
//        System.out.println(arr.length);

        for(int row = 0; row<arr.length; row++){
            for(int col =0; col<arr[row].length; col++){
                arr[row][col] =  sc.nextInt();

            }
        }
//        for(int row = 0; row<arr.length; row++){
//            for(int col =0; col<arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//
//            }
//        }
//        for (int[] ints : arr) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//
//            }
//            System.out.println();
//        }

        for(int[] num: arr){
            System.out.println(Arrays.toString(num) + " ");
        }
    }
}
