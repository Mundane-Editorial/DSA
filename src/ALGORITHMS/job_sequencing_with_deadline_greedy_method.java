package ALGORITHMS;

import java.util.Arrays;
import java.util.Comparator;

public class job_sequencing_with_deadline_greedy_method {
    static class Jobs{
        int profit = 0;
        int deadline = 0;
        Jobs(int p, int d){
            profit = p;
            deadline = d;
        }
    }

    private static int maxProfit(Jobs[] job) {
        Arrays.sort(job, (a,b) -> b.profit - a.profit);

        int maxDeadline = 0;
        for(Jobs obj : job){
            maxDeadline = Math.max(maxDeadline, obj.deadline);
        }

        int[] sequencer = new int[maxDeadline + 1];
        Arrays.fill(sequencer, -1);

        int totalProfit = 0;
        for(Jobs j : job){
            for(int slot = j.deadline; slot > 0; slot--){
                if(sequencer[slot] == -1){
                    sequencer[slot] = j.profit;
                    totalProfit = totalProfit + j.profit;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(sequencer));
        return totalProfit;
    }

    public static void main(String[] args) {
        Jobs[] job = {
                new Jobs(20,2),
                new Jobs(15,2),
                new Jobs(10,1),
                new Jobs(5,3),
                new Jobs(1,3)
        };

        System.out.println("Total profit :: " + maxProfit(job));
    }

}
