package ALGORITHMS;

import java.util.Arrays;
public class fractional_knapsack_problem_greedy_method {
    static class Items{
        int profit=0;
        int weight=0;

        Items(int p, int w){
            profit = p;
            weight = w;
        }
    }

    private static double totalProfit(Items[] item, int capacity) {
        Arrays.sort(item, (a,b) -> Double.compare((double)b.profit/ b.weight, (double)a.profit/ a.weight));

        double totalValue = 0;
        for(Items i : item){
            if(capacity >= i.weight){
                capacity = capacity - i.weight;
                totalValue = totalValue + i.profit;
            }else{
                totalValue = totalValue + (double) capacity * i.profit / i.weight;
                break;
            }
        }
        return totalValue;
    }


    public static void main(String[] args) {
        Items[] item = {
                new Items(10,2),
                new Items(5,3),
                new Items(15,5),
                new Items(7,7),
                new Items(6,1),
                new Items(18,4),
                new Items(3,1)
        };

        int capacity = 15;
        System.out.println("Maximum Value :: " + totalProfit(item, capacity));
    }
}
