package ALGORITHMS;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstras_algorithm_greedy {
    static class edge{
        int src = 0;
        int dest = 0;
        int wt = 0;

        edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<edge> graph[], int V){
        for(int i=0; i<V; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edge(0, 1, 2));
        graph[0].add(new edge(0, 2, 4));

        graph[1].add(new edge(1, 2, 1));
        graph[1].add(new edge(1, 3, 7));

        graph[2].add(new edge(2, 4, 3));

        graph[3].add(new edge(3, 5, 1));

        graph[4].add(new edge(4, 3, 2));
        graph[4].add(new edge(4, 5, 5));

    }

    static class pair implements Comparable<pair> {
        int node = 0;
        int cost = 0;

        pair(int n, int c){
            this.cost = c;
            this.node = n;
        }

        public int compareTo(pair p2){
            return this.cost - p2.cost;
        }
    }

    static void DijkstraAlgo(ArrayList<edge> graph[], int V, int src){
        PriorityQueue<pair> pq = new PriorityQueue<>();
        pq.add(new pair(0, 0));

        int[] dist = new int[V];
        for(int i=0; i<V; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        boolean[] visited = new boolean[V];

        //bfs
        while(!pq.isEmpty()){
            pair curr = pq.poll();
            if(!visited[curr.node]){
                visited[curr.node] = true;

                for (edge e : graph[curr.node]) {
                    int u = e.src;
                    int v = e.dest;

                    if (dist[u] + e.wt < dist[v]) {
                        dist[v] = dist[u] + e.wt;
                        pq.add(new pair(v, dist[v]));
                    }
                }
            }
        }

        System.out.println("Shortest distances from node " + src + ":");
        for (int i = 0; i < V; i++) {
            System.out.println("To " + i + " = " + (dist[i] == Integer.MAX_VALUE ? "∞" : dist[i]));
        }
    }

    public static void main(String[] args) {
        int V = 6;

        ArrayList<edge> graph[] = new ArrayList[V];
        createGraph(graph, V);
        int src = 0;
        DijkstraAlgo(graph, V, src);
    }
}
