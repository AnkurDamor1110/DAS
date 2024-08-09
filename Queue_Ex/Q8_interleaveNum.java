package Queue_Ex;

import java.util.*;

public class Q8_interleaveNum {

    public static void interleave(Queue<Integer> q) {
        int size = q.size();

        Queue<Integer> first = new LinkedList<>();

        for (int i = 1; i <= size / 2; i++) {
            first.add(q.remove());
        }

        while (!first.isEmpty()) {
            q.add(first.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            q.add(i);
        }
        System.out.println(q);

        interleave(q);

        System.out.println(q);

    }
}
