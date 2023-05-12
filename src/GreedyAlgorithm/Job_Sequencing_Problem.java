package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Job_Sequencing_Problem {
    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int id, int deadline,  int profit)
        {
            this.id  = id;
            this.deadline = deadline;
            this.profit = profit;
        }


    }
    public static void main(String[] args) {
        int jobsInfo[][] = {{4, 20},{1, 10}, {1, 40}, {1, 30}};
        ArrayList<Job> jobs = new ArrayList<>();

        for(int i =0; i<jobsInfo.length; i++)
        {
            Job j = new Job(i, jobsInfo[i][0], jobsInfo[i][1]);
            jobs.add(j);
        }

        Collections.sort(jobs, (obj1, obj2)->obj2.profit-obj1.profit); // Descending Order
ArrayList<Integer> seq = new ArrayList<>();
int time  =0;
int profit = 0;
        for(int i=0; i<jobs.size(); i++)
        {
            Job curr = jobs.get(i);
            if(curr.deadline>time){
                profit+=curr.profit;
                time++;
                seq.add(curr.id);
            }
        }

        System.out.println("Time: " +  time);
        System.out.println("Maximum jobs done "+ seq.size());
        System.out.println("Profit is "+  profit);
        System.out.println("Sequence of jobs is :");
        for(int i=0; i<seq.size(); i++)
        {
            System.out.print(seq.get(i) + " ");
        }
    }
}
