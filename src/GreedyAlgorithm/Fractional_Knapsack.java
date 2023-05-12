package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class Fractional_Knapsack {
    public static void main(String[] args) {
        int weight[]=  {10 , 20, 30};
        int val[] ={60, 100, 120};
        int w = 50;


        double ratio[][] = new double[val.length][2];
//        0th col =  index;
//        1 st col = ratio;

for(int i=0; i<ratio.length; i++)
{
    ratio[i][0] = i;
    ratio[i][1] = val[i]/(double)weight[i];
}
// ascending order sorting
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));

int  capacity =  w;
int value  = 0;
for(int i = ratio.length-1; i>=0; i--)
{
    double x  = ratio[i][0];
    if(capacity>=weight[(int) x]){
        capacity = capacity-weight[(int) x];
        value +=val[(int) x];
    }
    else{
        value+=ratio[i][1]*  capacity;
        break;
    }
}
        System.out.println("Your Value is " + value);

    }
}
