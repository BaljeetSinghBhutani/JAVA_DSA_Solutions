package com.codewithkunalkushwaha;

import java.util.Scanner;

public class printing_nth_Fibonacci_number {
    public static void main(String[] args) {

        System.out.println(" Nth Fibonacci Number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        int a = 0;
        int b = 1;


        if (n == 1) {
            System.out.println(a);
        }

       else  if (n == 2) {
            System.out.println(b);
        }

       else if(n > 2) {
            for(int i = 3; i<=n; i++){
                 c = a + b;
                 a = b;
                 b = c;
            }

            System.out.println(c);


        }
    }
}