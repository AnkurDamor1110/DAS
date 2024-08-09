package Graph.Part_2;

import java.util.ArrayList;

public class DirectedGraphCycle {
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
        graph[0].add(new Edge(0, 2, 5));

        //1-vertex
        graph[1].add(new Edge(1, 0, 5));
        // graph[1].add(new Edge(1, 3 , 3));
        // graph[1].add(new Edge(1, 2, 1));

        //2-vertex
        graph[2].add(new Edge(2, 3, 2));
        // graph[2].add(new Edge(2, 1, 1));
        // graph[2].add(new Edge(2, 3, 1));

        //3-vertex
        graph[3].add(new Edge(3, 0, 3));
        // graph[3].add(new Edge(3, 2, 1));

        // 4 -vertex
        // graph[4].add(new Edge(4, 2, 2));

        // //5-vertex
        // graph[5].add(new Edge(5, 5, 2));

        // //6 - vertex
        // graph[6].add(new Edge(6, 6, 1));

    }
    public static boolean isCycle(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(isCycleUtil(graph, i, vis, stack)){
                    for(int j=0;j<stack.length;j++){
                        System.out.print(stack[j] + " ");
                    }
                    return true;
                }
            }
        }
        
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge>[] graph,int curr,boolean vis[],boolean stack[]){
        vis[curr] = true;
        stack[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(stack[e.dest]){
                return true;
            } 

            if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)){
                return true;
            }
        }

        stack[curr] = false;
        return false;
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V=4;
        // int[] graph = new int[]
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(V, graph);
        
        System.out.println(isCycle(graph));
      
    }
}
