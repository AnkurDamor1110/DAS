package Graph.Part_4;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MinimumSpanningTree {
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
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        //1-vertex
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3 , 40));

        //2-vertex
        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        //3-vertex
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));

      
    }

    static class Pair implements Comparable<Pair> {
    
        int v;
        int cost;

        public Pair(int v,int path){
            this.v=v;
            this.cost=path;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }
    }

    public static void prims(ArrayList<Edge>[] graph){
        boolean vis[]= new boolean[graph.length];

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        int finalCost = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            if(!vis[curr.v]){
                vis[curr.v] = true;
                finalCost += curr.cost;

                for(int i=0;i<graph[curr.v].size();i++){
                    Edge e = graph[curr.v].get(i);

                    pq.add(new Pair(e.dest, e.wt));
                }
            }
        }

        System.out.println("Final(MST) min cost of "+ finalCost);
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V=4;
        // int[] graph = new int[]
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(V, graph);
        prims(graph);
    }
}
