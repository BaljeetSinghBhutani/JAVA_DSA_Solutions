package com.codewithkunalkushwaha;

import java.util.Scanner;

public class Reverse_the_number {
    public static void main(String[] args) {

        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

      while(n>0){
            int rev = n %10;
                n = n/10;
               result = rev  + result * 10;
            }

        System.out.println(result);

        }
    }

