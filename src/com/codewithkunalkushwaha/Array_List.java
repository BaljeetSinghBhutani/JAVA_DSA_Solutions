package com.codewithkunalkushwaha;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(67);
//        list.add(671);
//        list.add(672);
//        list.add(674);
//        list.add(675);
//        list.add(677);
//        list.set(0, 99);
//        list.remove(2);




//         Taking input from the user

        for(int i = 0; i<5; i++)
            list.add(sc.nextInt());
        for(int i = 0; i<5; i++)
            System.out.print(list.get(i) + " ");
        System.out.println(list.size());
    }
}
