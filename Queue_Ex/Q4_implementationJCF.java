package Queue_Ex;
import java.util.*;
public class Q4_implementationJCF {
    public static void main(String[] args) {
        Queue<Integer> q =new LinkedList<>(); //ArrayDeque

        //Queue is not a Object it is a interface, so we use LinkedList and ArrayDeque using for JCF

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
