package Graph.Part_4;

import java.util.ArrayList;


public class BellmanFord {
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
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        //1-vertex
        graph[1].add(new Edge(1, 2, -4));
        // graph[1].add(new Edge(1, 2 , 1));

        //2-vertex
        graph[2].add(new Edge(2, 3, 2));

        //3-vertex
        graph[3].add(new Edge(3, 4, 4));

        // 4 -vertex
        graph[4].add(new Edge(4, 1, -1));
        // graph[4].add(new Edge(4, 5, 5));

    }
    public static void bellmanFord(ArrayList<Edge>[] graph,int src){  // O(V * E)
        int dist[]= new int[graph.length];

        for(int i=0;i<dist.length;i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        int V = graph.length;
        // O(V)
        for(int i=0;i<V-1;i++){
            // O(E)
            for(int j=0;j<graph.length;j++){
                for(int k=0;k<graph[j].size();k++){
                    Edge e = graph[j].get(k);

                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }

        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i] + " ");
        }
    }


    public static void  createGraph2(int V, ArrayList<Edge> graph){
   
        // 0-vertex
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));

        //1-vertex
        graph.add(new Edge(1, 2, -4));
        // graph[1].add(new Edge(1, 2 , 1));

        //2-vertex
        graph.add(new Edge(2, 3, 2));

        //3-vertex
        graph.add(new Edge(3, 4, 4));

        // 4 -vertex
        graph.add(new Edge(4, 1, -1));
        // graph[4].add(new Edge(4, 5, 5));

    }

    public static void bellmanFord2(ArrayList<Edge> graph,int src,int V){  // O(V * E)
        int dist[]= new int[V];

        for(int i=0;i<dist.length;i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }


        // O(V)
        for(int i=0;i<V-1;i++){
            // O(E)
            for(int j=0;j<graph.size();j++){
                
                    Edge e = graph.get(j);

                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                        dist[v] = dist[u] + wt;
                    }
                
            }
        }

        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i] + " ");
        }
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V=5;
        // int[] graph = new int[]
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(V, graph);
        System.out.print("With Vetex and Edge" +" ");
        bellmanFord(graph, 0); 
        
        System.out.println();
        ArrayList<Edge> graph2 = new ArrayList<>();
        createGraph2(V, graph2);
        System.out.print("Only Edge" + " ");
        bellmanFord2(graph2, 0, V);
    }
}
