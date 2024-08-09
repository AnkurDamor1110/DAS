package Queue_Ex;
import java.util.*;
public class Q9_QueueReversal {

    public static void queueReversal(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        int sizeQ=q.size();
        for(int i=0;i<sizeQ;i++){
            s.push(q.remove());
        }

        int sizeS = s.size();
        for(int i=0;i<sizeS;i++){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            q.add(i);
        }
        System.out.println(q);
        queueReversal(q);
        System.out.println(q);
    }
}
