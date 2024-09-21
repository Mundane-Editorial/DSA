package Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class topological_sort {
    static class Edge{
        int src;
        int dest;
        Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    private static void topologicalSort(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> stack) {
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topologicalSort(graph, e.dest, vis, stack);
            }
        }
        stack.push(curr);
    }

    private static void createGraph(ArrayList<Edge>[] graph) {
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 0));

        graph[1].add(new Edge(1, 1));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 0));

        graph[5].add(new Edge(5, 0));
    }

    public static void main(String[] args) {
        int V = 6;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        boolean vis[] = new boolean[V];

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<V; i++){
            if(vis[i] == false){
                topologicalSort(graph, i, vis, stack);
            }
        }

//        for(int j=stack.size(); j>0; j--){
//            System.out.print(stack.get(j) + " ");
//        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop() + "->");
        }

    }

}
