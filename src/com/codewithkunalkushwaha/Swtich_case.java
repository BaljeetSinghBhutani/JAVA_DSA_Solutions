package com.codewithkunalkushwaha;

import java.util.Scanner;

public class Swtich_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit  =  sc.next();


        switch(fruit) {
            case "Mango":
                System.out.println("King of fruits ");
                 break;
             case "Apple":
                System.out.println("Sweet red fruit");
                 break;

            case "Orange":
                System.out.println("Round Fruit");
                break;

            case "Grapes":
                System.out.println("Small Fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit");

        }

    }
}
