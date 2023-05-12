package com.codewithkunalkushwaha;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int number1 = input.nextInt();
//        int number2 = input.nextInt();

//        int sum = number1+ number2;
//        System.out.println("Sum = "+ sum);

//         type casting
//        int num = (int) 45.67f;
//        System.out.println(num);

//        automatic type promotion in expressions
//        int a = 257;
//
//       byte b = (byte) a;
//       257%256
//        System.out.println(b);
//
//        byte  a = 40;
//        byte  b = 50;
//        byte  c = 100;
//        int d =  a*b /c;
//        System.out.println(d);

//        int num = 'A';
//        System.out.println("");

      byte b = 42;
      char c = 'a';
      short s = 1024;
      int i = 50000;
      float f = 5.67f;
      double d = 0.1234;
      double result = ((f * b) + (i / c)) - (d - c);
//       float + int - double = double
        System.out.println((f*b)+ " " + (i/c)+ " " + " " + (d-s));
        System.out.println(result);
    }
}
