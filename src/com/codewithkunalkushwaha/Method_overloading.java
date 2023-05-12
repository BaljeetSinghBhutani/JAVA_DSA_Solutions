package com.codewithkunalkushwaha;

public class Method_overloading {
    public static void main(String[] args) {
        fun(45);
        fun("Baljeet Singh Bhutani");

    }
    static void fun(int a ){
        System.out.println(a);
    }
    static void fun(String a){
        System.out.println(a);
    }

}
