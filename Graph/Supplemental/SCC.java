package Graph.Supplemental;

import java.util.ArrayList;
import java.util.Stack;

// Strongly connected component
public class SCC {
    static class Edge{
        int src;
        int dest;
        public Edge(int src,int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void bulidGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        // graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));


    }

    public static void topSort(ArrayList<Edge>[] graph,int curr,boolean[] vis,Stack<Integer> s){
        vis[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topSort(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    public static void dfs(ArrayList<Edge>[] graph,int curr,boolean vis[]){
        vis[curr] = true;
        System.out.print(curr + " ");
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }
    
    public static void kosaraju(ArrayList<Edge>[] graph,int V){

        // step:1
        Stack<Integer> s = new Stack<>();
        boolean[] vis = new boolean[V];

        for(int i=0;i<V;i++){
            if(!vis[i]){
                topSort(graph, i, vis, s);
            }
        }
        @SuppressWarnings("unchecked")
        // step:2
        ArrayList<Edge>[] transpose = new ArrayList[V];

        for(int i=0;i<V;i++){
           vis[i] = false;
           transpose[i] = new ArrayList<>();
        }

        for(int i=0;i<V;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }


        // step:3
        while(!s.isEmpty()){
            int curr = s.pop();
            if(!vis[curr]){
                dfs(transpose, curr, vis);
                System.out.println();
            }
        }
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph =  new ArrayList[V];
        bulidGraph(graph);

        kosaraju(graph, V);
    }
}
