package Graph.Part_2;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
     static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void  createGraph(int V, ArrayList<Edge>[] graph){
        for(int i=0;i<V;i++){
            graph[i] = new ArrayList<>();
        }

        // 0-vertex
        // graph[0].add(new Edge(0, 2, 5));

        //1-vertex
        // graph[1].add(new Edge(1, 0, 5));
        // graph[1].add(new Edge(1, 3 , 3));
        // graph[1].add(new Edge(1, 2, 1));

        //2-vertex
        graph[2].add(new Edge(2, 3, 2));
        // graph[2].add(new Edge(2, 1, 1));
        // graph[2].add(new Edge(2, 3, 1));

        //3-vertex
        graph[3].add(new Edge(3, 1, 3));
        // graph[3].add(new Edge(3, 2, 1));

        // 4 -vertex
        graph[4].add(new Edge(4, 0, 2));
        graph[4].add(new Edge(4, 1, 2));

        // //5-vertex
        graph[5].add(new Edge(5, 0, 2));
        graph[5].add(new Edge(5, 2, 2));

        // //6 - vertex
        // graph[6].add(new Edge(6, 6, 1));

    }
    public static void topSort(ArrayList<Edge>[] graph){
        boolean[] vis =new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                topSortUtil(graph, i, vis, s);
            }
        }

        while (!s.isEmpty()) {
            System.out.print(s.pop()+ " ");
        }
    }
    public static void topSortUtil(ArrayList<Edge>[] graph,int curr,boolean[] vis,Stack<Integer> s){
        vis[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.dest]){
                topSortUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V=6;
        // int[] graph = new int[]
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(V, graph);
        
        topSort(graph);
      
    }
}
