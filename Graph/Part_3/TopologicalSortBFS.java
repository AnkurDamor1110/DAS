package Graph.Part_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class TopologicalSortBFS {
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
   public static void calcIndeg(ArrayList<Edge>[] graph,int indeg[]){
        for(int i=0;i<graph.length;i++){
            int v=i;
            for(int j=0;j<graph[v].size();j++){
                Edge e = graph[v].get(j);
                indeg[e.dest]++;
            }
        }
        for(int i=0;i<indeg.length;i++){
            System.out.print(indeg[i] +" ");
        }
        System.out.println();
   }
    
   public static void topSort(ArrayList<Edge>[] graph){
    int indeg[]= new int[graph.length];
    calcIndeg(graph, indeg);
    Queue<Integer> q =new LinkedList<>();

    for(int i=0;i<indeg.length;i++){
        if(indeg[i] == 0){
            q.add(i);
        }
    }
    while (!q.isEmpty()) {
        int curr = q.remove();
        System.out.print(curr + " ");

        for(int i=0;i<graph[curr].size();i++){
            Edge e =graph[curr].get(i);

            indeg[e.dest]--;
            if(indeg[e.dest] == 0){
                q.add(e.dest);
            }
        }
        // System.out.println();
    }
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
