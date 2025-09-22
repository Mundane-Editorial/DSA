package usthaan;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class minimum_cost_spanning_tree {
    static class edge{
        int src;
        int dest;
        int wt;

        edge(int s, int d, int wt){
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<edge> graph[], int V){
        for(int i=0; i<V; i++) {
            graph[i] = new ArrayList<>();
        }

            graph[0].add(new edge(0, 1, 28));
            graph[0].add(new edge(0, 5, 10));

            graph[1].add(new edge(1, 0, 28));
            graph[1].add(new edge(1, 2, 16));
            graph[1].add(new edge(1, 6, 14));

            graph[2].add(new edge(2, 1, 16));
            graph[2].add(new edge(2, 3, 12));

            graph[3].add(new edge(3, 2, 12));
            graph[3].add(new edge(3, 6, 18));
            graph[3].add(new edge(3, 4, 22));

            graph[4].add(new edge(4, 3, 22));
            graph[4].add(new edge(4, 6, 24));
            graph[4].add(new edge(4, 5, 25));

            graph[5].add(new edge(5, 0, 10));
            graph[5].add(new edge(5, 4, 25));

            graph[6].add(new edge(6, 4, 24));
            graph[6].add(new edge(6, 1, 14));
            graph[6].add(new edge(6, 3, 18));
    }

    static class pair implements Comparable<pair>{
        int cost = 0;
        int node = 0;

        pair(int c, int n){
            this.cost = c;
            this.node = n;
        }

        public int compareTo(pair p2){
            return this.cost - p2.cost;
        }
    }

    private static int primsAlgo(ArrayList<edge>[] graph, int V) {
        PriorityQueue<pair> pq = new PriorityQueue<>();
        pq.add(new pair(0,0));

        boolean[] isVisited = new boolean[V];
        int cost = 0;

        while(!pq.isEmpty()){
            pair curr = pq.poll();
            if(!isVisited[curr.node]){
                isVisited[curr.node] = true;

                cost = cost + curr.cost;

                for(int i=0; i<graph[curr.node].size(); i++){
                    edge e = graph[curr.node].get(i);
                    if(!isVisited[e.dest]){
                        pq.add(new pair(e.wt, e.dest));
                    }
                }
            }
        }
        return cost;
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<edge> graph[] = new ArrayList[V];
        createGraph(graph, V);
        System.out.println("minimum spanning tree cost = " + primsAlgo(graph, V));
    }
}
