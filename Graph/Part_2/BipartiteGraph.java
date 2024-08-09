package Graph.Part_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {
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
        // graph[5].add(new Edge(5, 5, 2));

        // //6 - vertex
        // graph[6].add(new Edge(6, 6, 1));

    }
    
    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int col[]= new int[graph.length];

        for(int i=0;i<col.length;i++){
            col[i] = -1;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<graph.length;i++){
            if(col[i] == -1){ //BFS
                q.add(i);
                col[i]=0; // yellow

                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for(int j=0;j<graph[curr].size();j++){
                        Edge e = graph[curr].get(j);

                        if(col[e.dest] == -1){
                            int nextCol = col[curr] == 0 ? 1 : 0;
                            col[e.dest] = nextCol;
                            q.add(e.dest);
                        } else if( col[e.dest] == col[curr]){
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
   
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V=5;
        // int[] graph = new int[]
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(V, graph);
        System.out.println(isBipartite(graph));
    }
}
