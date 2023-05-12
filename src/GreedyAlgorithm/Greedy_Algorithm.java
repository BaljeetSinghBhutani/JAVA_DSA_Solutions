package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Greedy_Algorithm {
    public static void main(String[] args) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        Arrays.sort(coins, Comparator.reverseOrder());

        int CountOfCoins = 0;
        int amount = 590;
        ArrayList<Integer> list  = new ArrayList<>();

        for(int i =0; i<coins.length; i++)
        {
            while(coins[i]<=amount)
            {
                CountOfCoins++;
                amount-=coins[i];
                list.add(coins[i]);
            }
        }


        System.out.println("The ans is "+ CountOfCoins);
        System.out.println(list);

    }
}
