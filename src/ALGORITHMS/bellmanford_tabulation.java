package ALGORITHMS;

import java.util.ArrayList;

public class bellmanford_tabulation {
    static class edge{
        int src = 0;
        int dest = 0;
        int wt = 0;

        edge(int s, int d, int wt){
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
    }

    private static void createGraph(ArrayList<edge>[] graph, int V) {
        for(int i=0; i<V; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edge(0, 1, 6));
        graph[0].add(new edge(0, 2, 5));
        graph[0].add(new edge(0, 3, 5));

        graph[1].add(new edge(1, 4, -1));

        graph[2].add(new edge(2, 1, -2));
        graph[2].add(new edge(2, 4, 1));

        graph[3].add(new edge(3, 2, -2));
        graph[3].add(new edge(3, 5, -1));

        graph[4].add(new edge(4, 6, 5));

        graph[5].add(new edge(5, 6, 3));

        graph[6].add(new edge(6, 6, 0));

//        graph[0].add(new edge(0, 1, 4));
//        graph[0].add(new edge(0, 3, 5));
//
//        graph[1].add(new edge(1, 1, 0));
//
//        graph[2].add(new edge(2, 1, -10));
//
//        graph[3].add(new edge(3, 2, 3));

    }

    private static void bellmanFord(ArrayList<edge> graph[], int V, int src){  //using tabulation method
        int INF = (int)1e9;
        int[] dist = new int[V];

        for(int i=0; i<V; i++){
            dist[i] = INF;
        }
        dist[src] = 0;

        // step 2 : perform relaxation V-1 times
        for(int i=0; i<V; i++){
            for(int u = 0; u < V; u++){
                for(edge e : graph[u]){
                    if(dist[u] != INF && dist[u] + e.wt < dist[e.dest]){
                        dist[e.dest] = dist[u] + e.wt;
                    }
                }
            }
        }

        //step 3 : check for -ve weights
        boolean NegativeWeight = false;
        for(int u = 0; u < V; u++){
            for(edge e : graph[u]){
                if(dist[u] != INF && dist[u] + e.wt < dist[e.dest]){
                    NegativeWeight = true;
                    break;
                }
            }
        }

        //step 4 : print final shortest path
        System.out.println("Shortest path from source " + src + ":");
        for(int i = 0; i<V; i++){
            if(dist[i] == INF){
                System.out.println("Vertex " + i + " : INF");
            }else{
                System.out.println("Vertex " + i + " : " + dist[i]);
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<edge> graph[] = new ArrayList[V];
        createGraph(graph, V);
        bellmanFord(graph, V, 0);
    }

}
