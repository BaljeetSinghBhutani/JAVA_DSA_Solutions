package SandeepJaim.Lecture_1_Practice_Question;

import java.util.Arrays;
import java.util.Comparator;

class Pair{
    int x;
    int y;

    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Pair_in_Java {
    static void sortPairs(Pair arr[], int N) {

        // Your code here
  sortPair p = new sortPair();

Arrays.sort(arr, new sortPair());


        //printing the x,y Pairs


        for(int i = 0;i<N;i++){
            System.out.print(arr[i].x + " " + arr[i].y + " ");
        }
        System.out.println();




    }

   static class sortPair implements Comparator<Pair> {

        @Override
        public int compare(Pair o1, Pair o2) {
            return o1.x-o2.x;
        }
    }

    public static void main(String[] args) {

    }
}
