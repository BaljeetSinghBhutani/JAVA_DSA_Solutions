package Maths_For_DSA;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
 factor3(20);
    }



    static void factor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

//    O(sqrt)
    static void factor2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                if(n/i==i){
                    System.out.println(i+ " ");
                }
                else {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }


//    Both time and space will be Square root of n
static void factor3(int n) {
    ArrayList<Integer> list= new ArrayList<>();

    for (int i = 1; i <= Math.sqrt(n); i++) {

        if (n % i == 0) {
            if (n / i == i) {
                System.out.println(i + " ");
            } else {
                System.out.print(i + " ");
                list.add(n / i);
            }
        }
    }

        for(int i1=  list.size()-1; i1>=0; i1--)
        {
            System.out.print(list.get(i1) + " ");
        }

}





}
