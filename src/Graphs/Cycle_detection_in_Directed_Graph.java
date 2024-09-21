package Graphs;

import java.util.ArrayList;

public class Cycle_detection_in_Directed_Graph {
    static class Edge{
        int src;
        int dest;
        Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    private static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));

        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
    }

    public static void main(String[] args) {
        int V = 4;

        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        boolean vis[] = new boolean[V];

        boolean recstack[] = new boolean[V];

        for(int i=0; i<V; i++){
            if(!vis[i]){
                boolean isCycle = isCycle(graph, vis, i,recstack);
                if(isCycle){
                    System.out.println("Cycle Detected for i = " + i);
                }else{
                    System.out.println("Clean Structure");
                }
            }
        }

//        for (int i = 0; i < V; i++) {
//            System.out.print("Vertex " + i + ": ");
//            for (int j = 0; j < graph[i].size(); j++) {
//                Edge e = graph[i].get(j);
//                System.out.print(e.dest + " ");
//            }
//            System.out.println();
//        }
//
//
//        //cycle
//        for (int j = 0; j < graph[1].size(); j++) {
//            Edge e = graph[1].get(j);
//            System.out.print(e.dest + " ");
//        }
    }

    private static boolean isCycle(ArrayList<Edge>[] graph, boolean[] vis, int curr, boolean[] recstack) {
        vis[curr] = true;
        recstack[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[i].get(i);
            if(vis[e.dest]){
                return true;
            }else if(!vis[e.dest]){
                if(isCycle(graph, vis, e.dest, recstack)){
                    return true;
                }
            }
        }
        recstack[curr] = false;
        return false;
    }
}
