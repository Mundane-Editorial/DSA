package Graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims_algo_for_MST {
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }

    }

    private static void createGraph(ArrayList<Edge>[] graph) {
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

            graph[0].add(new Edge(0, 1, 10));
            graph[0].add(new Edge(0, 2, 15));
            graph[0].add(new Edge(0, 3, 30));

            graph[1].add(new Edge(1, 0, 10));
            graph[1].add(new Edge(1, 3, 40));

            graph[2].add(new Edge(2, 0, 15));
            graph[2].add(new Edge(2, 3, 50));

            graph[3].add(new Edge(3, 1, 40));
            graph[3].add(new Edge(3, 2, 50));

    }

    static class Pair implements Comparable<Pair>{
        int node;
        int cost;
        Pair(int n, int c){
            this.node = n;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    private static void primsAlgo(ArrayList<Edge> graph[], int V){
        PriorityQueue<Pair> pq = new PriorityQueue<>(); // non mst set
        pq.add(new Pair(0,0));

        boolean[] vis = new boolean[V]; //mst set

        int mstcost = 0;
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.node]){
                vis[curr.node] = true;
                mstcost += curr.cost;

                for(int i=0; i<graph[curr.node].size(); i++){
                    Edge e = graph[curr.node].get(i);

                    if(!vis[e.dest]){
                        pq.add(new Pair(e.dest, e.wt));
                    }
                }
            }
        }

        System.out.println("min cost of mst  : " + mstcost);
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        primsAlgo(graph, V);
    }

}
