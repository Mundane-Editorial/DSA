package Graphs;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Shortest_path_Dijkstras_Algorithmn {
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
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        dijkstra(graph, 0, V);
    }

    private static void createGraph(ArrayList<Edge>[] graph) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
            graph[0].add(new Edge(0, 1, 2));
            graph[0].add(new Edge(0, 2, 4));

            graph[1].add(new Edge(1, 2, 1));
            graph[1].add(new Edge(1, 3, 7));

            graph[2].add(new Edge(2, 4, 3));

            graph[3].add(new Edge(3, 5, 1));

            graph[4].add(new Edge(4, 3, 2));
            graph[4].add(new Edge(4, 5, 5));
    }

    public static class Pair implements Comparable<Pair>{  //implements Comparable<Pair>   :: by using this interface,
        // now Pair class has the power to choose whether to sort for distance or node.
        int node;
        int dist;
        Pair(int n, int d){
            this.node = n;
            this.dist = d;
        }

        @Override
        public int compareTo(Pair p2){
            return this.dist - p2.dist;  // ascending order
            // return p2.dist - this.dist    > descending order
        }
    }
    private static void dijkstra(ArrayList<Edge> graph[], int src, int V){
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        int[] dist = new int[V];
        for(int i=0; i<V; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        boolean vis[] = new boolean[V];

        pq.add(new Pair(0,0)); // at node 0, distance is 0

        // bfs

        while(!pq.isEmpty()){
            Pair curr = pq.remove(); // shortest
            if(!vis[curr.node]){
                vis[curr.node] = true;

                for(int i=0; i<graph[curr.node].size(); i++){
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;

                    if(dist[u] + e.wt < dist[v]){
                        dist[v] = dist[u] + e.wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
            
        }

        for(int i=0; i<V; i++){
            System.out.print(dist[i] + " ");
        }
    }
}


// time complexity : O(E + E logV)
//  E logV :: priority queue
//  E :: traversing all nodes