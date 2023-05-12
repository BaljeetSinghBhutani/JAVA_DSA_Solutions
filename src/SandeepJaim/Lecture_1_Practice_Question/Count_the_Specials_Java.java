package SandeepJaim.Lecture_1_Practice_Question;

import java.util.HashMap;
import java.util.Iterator;

public class Count_the_Specials_Java {

    static int countSpecials(int a[], int n, int k) {
        int f = (int) Math.floor(n / k);
        // your code here

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }


        int count = 0;
        for (Integer capital : map.values())    {     //using values() for iteration over keys
            if (capital == f) {
                count++;
            }

    }
        return count;

}
    public static void main(String[] args) {

    }
}
