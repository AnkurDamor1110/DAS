package Heaps;

import java.util.PriorityQueue;

public class H6_ConnectRopes {
    public static void main(String[] args) {
        int rops[]={2,3,3,4,6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<rops.length;i++){
            pq.add(rops[i]);
        }

        int cost=0;

        while (pq.size() > 1) {
            int min1 = pq.remove();
            int min2 = pq.remove();
            cost += min1 + min2;

            pq.add(min1 + min2);
        }

        System.out.println(cost);
    }
}
