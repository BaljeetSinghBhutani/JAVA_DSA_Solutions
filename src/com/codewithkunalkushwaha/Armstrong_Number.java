package com.codewithkunalkushwaha;

import java.util.Scanner;

public class Armstrong_Number {
    static  Boolean isArmstrong(int n){

        int n1 = n;

          int sum = 0;
        while (n>0){
            int arm = n%10;
            n/=10;
            sum = arm*arm *arm + sum;
        }
        return sum == n1;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));

        for(int i = 100; i<1000; i++){
            if(isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }
}
