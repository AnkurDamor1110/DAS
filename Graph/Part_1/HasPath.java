package Graph.Part_1;
import java.util.*;
public class HasPath {
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

    }
    public static boolean hasPath(ArrayList<Edge>[] graph,int src,int dest,boolean visit[]){
        if(src == dest){
            return true;
        }
        visit[src] = true;

        for(int i=0;i<graph[src].size();i++){
            Edge e =graph[src].get(i);

            if(!visit[e.dest] && hasPath(graph, e.dest, dest, visit)){
                return true;
            }
        }

        return false;
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
          int V=5;
        // int[] graph = new int[]
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(V, graph);

        System.out.println(hasPath(graph, 0, 4, new boolean[V]));
    }
}
