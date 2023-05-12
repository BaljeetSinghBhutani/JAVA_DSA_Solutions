package com.codewithkunalkushwaha;

import java.util.Scanner;

public class String_Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.println(greet(name));

    }
    static String greet(String name) {
        return "Hello " +  name;

    }


}

