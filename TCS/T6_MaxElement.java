package TCS;

import java.util.*;

public class T6_MaxElement {
    public static void main(String[] args) {
        int arr[]= {2,4,7,1,6,3};
        int k=3;
        int N = arr.length;
       

        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>(); // store index of elements 

        for(int i=0;i<k;i++){
            if(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){
                dq.removeLast();
            }

            dq.addLast(i);
        }


        for(int i=k;i<N;i++){
            list.add(arr[dq.peekFirst()]);

            //remove element out of window

            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.removeFirst();
            }

            // remove element from last smallear then currant

            while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){
                dq.removeLast();
            }

            dq.addLast(i);
        }

        list.add(arr[dq.peekFirst()]);


        System.out.println(list);
       
        

    }
}
