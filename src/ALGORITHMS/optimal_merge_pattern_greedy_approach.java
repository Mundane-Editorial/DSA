package ALGORITHMS;

import java.util.*;

public class optimal_merge_pattern_greedy_approach {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> List = new ArrayList<>();
        List.add(new ArrayList<>(Arrays.asList(2, 6, 5, 3, 4)));
        List.add(new ArrayList<>(Arrays.asList(1, 9, 7)));
        List.add(new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 20)));
        List.add(new ArrayList<>(Arrays.asList(8, 15)));
        List.add(new ArrayList<>(Arrays.asList(5, 5, 5, 5, 5, 5, 4, 10)));

        System.out.println("total minimum cost :: " + optimalMerge(List));
    }

    private static int optimalMerge(ArrayList<ArrayList<Integer>> list) {
        PriorityQueue<ArrayList<Integer>> minheap = new PriorityQueue<>(Comparator.comparingInt(List::size));
        minheap.addAll(list);

        ArrayList<Integer> res = minheap.poll();
        int cost = 0;
        while(!minheap.isEmpty()){
            ArrayList<Integer> B = minheap.poll();
            cost = res.size() + B.size();
            res = merger(res, B);
        }
        return cost;
    }

    private static ArrayList<Integer> merger(ArrayList<Integer> res, ArrayList<Integer> b) {
        Collections.sort(res);
        Collections.sort(b);
        ArrayList<Integer> sorted = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<res.size() && j<b.size()){
            if(res.get(i) < b.get(j)){
                sorted.add(res.get(i++));
            }else{
                sorted.add(b.get(j++));
            }
        }

        while(i<res.size()){
            sorted.add(res.get(i++));
        }

        while(j<b.size()){
            sorted.add(b.get(j++));
        }

        return sorted;
    }
}

