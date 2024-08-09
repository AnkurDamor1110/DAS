package Graph.Part_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ConnectedComponentGraph {
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
        graph[0].add(new Edge(0, 1, 5));

        //1-vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 3 , 3));
        graph[1].add(new Edge(1, 2, 1));

        //2-vertex
        graph[2].add(new Edge(2, 4, 2));
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));

        //3-vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // 4 -vertex
        graph[4].add(new Edge(4, 2, 2));

        //5-vertex
        graph[5].add(new Edge(5, 5, 2));

        //6 - vertex
        graph[6].add(new Edge(6, 6, 1));

    }
    public static void bfs(ArrayList<Edge>[] graph){
        
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                bfsUtil(graph, vis,i);
            }
        }
    }
    public static void bfsUtil(ArrayList<Edge>[] graph,boolean vis[],int start){
        Queue<Integer> q = new LinkedList<>();

        q.add(start); //source=0

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){
                System.out.print(curr + " ");
                vis[curr] = true;

                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }



    public static void dfs(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                dfsUtil(graph,i,vis);
            }
        }
    }
    public static void dfsUtil(ArrayList<Edge>[] graph,int curr,boolean visit[]){
        System.out.print(curr + " ");
        visit[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(!visit[e.dest]){
                dfsUtil(graph, e.dest, visit);
            }
        }
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V=7;
        // int[] graph = new int[]
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(V, graph);

        bfs(graph);
        System.out.println();
        dfs(graph);
    
    }
}
