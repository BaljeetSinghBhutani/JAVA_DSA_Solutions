package com.codewithkunalkushwaha;

import java.util.Arrays;

public class varrgs {
    public static void main(String[] args) {
        fun(2, 3, 4 ,5, 6, 7, 8, 9, 10);
        multiple(2,3, "Kunal", " Rahul", " Rana", "Kiran");
        demo(45, 67, 89);

    }
    static void multiple(int a , int b , String ...v){
//        System.out.println(Arrays.toString());
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(int...v){
        System.out.println(Arrays.toString(v));
    }
}
