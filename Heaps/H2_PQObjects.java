package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class H2_PQObjects {

    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder()); // for reverse Comparator.reverseOrder()

        pq.add(new Student("A", 14));
        pq.add(new Student("B", 2));
        pq.add(new Student("C", 1));


        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();
        }
    }
}
