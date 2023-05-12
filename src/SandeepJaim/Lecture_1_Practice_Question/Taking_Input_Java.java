package SandeepJaim.Lecture_1_Practice_Question;

import java.util.Scanner;

public class Taking_Input_Java {
    static void IOFunction(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){

          int a = sc.nextInt();
            System.out.println(a);


            float b  = sc.nextFloat();
            System.out.println(b);

            long c  = sc.nextLong();
            System.out.println(c);

            byte d = sc.nextByte();
            System.out.println(d);

            String s = sc.nextLine();
            System.out.println(s);

        }

    }
    public static void main(String[] args) {

    }
}
