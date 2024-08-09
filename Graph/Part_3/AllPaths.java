package Graph.Part_3;

import java.util.ArrayList;

public class AllPaths {
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
        graph[0].add(new Edge(0, 3, 5));

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
    public static void printAllPath(ArrayList<Edge>[] graph,int src,int dest,String path){
        if(src == dest){
            System.out.println(path + dest );
            return;
        }

        for(int i=0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);

            printAllPath(graph, e.dest, dest, path + src);
        }
    }
    

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V=6;
        // int[] graph = new int[]
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(V, graph);
        printAllPath(graph, 5, 1, "");
}
}
