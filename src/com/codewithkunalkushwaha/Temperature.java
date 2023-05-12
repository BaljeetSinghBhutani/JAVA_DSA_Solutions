package com.codewithkunalkushwaha;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in celcuis: ");
        float c = sc.nextFloat();

        System.out.print("The Farenhite temperature is: ");
   float f =  ((9/5f ) * c )+ 32;
        System.out.println(f);
    }
}
