package Queue_Ex;
import java.util.*;
public class Q10_deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addLast(5);
        deque.addFirst(10);
        deque.addLast(20);
        System.out.println(deque);

        deque.removeFirst();
        System.out.println(deque);

        deque.removeLast();

        System.out.println(deque);


        System.out.println("first element "+ deque.getFirst());
        System.out.println("last element "+ deque.getLast());
    }
}
