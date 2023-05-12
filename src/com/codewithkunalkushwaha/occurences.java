package com.codewithkunalkushwaha;

import java.util.Scanner;

public class occurences {
    public static void main(String[] args) {

        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        System.out.println("Enter the number you want to search in the series : ");
        int n2 = sc.nextInt();


        int rem = 0;
        int count = 0;
        while (n1>0){
            rem = n1%10;
            if(rem == n2){
                count++;
            }
           n1/=10;
        }

        System.out.println(count);

    }
}
