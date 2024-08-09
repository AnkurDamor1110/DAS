package Hashing;

import java.util.*;
public class H11_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts =new TreeSet<>();

        ts.add(5);
        ts.add(55);
        ts.add(65);
        ts.add(89);
        ts.add(16);
        ts.add(95);

        System.out.println(ts);

        ts.remove(65);

        for (Integer element : ts) {
            System.out.print(element + " ");
        }

        System.out.println();
        
        System.out.println(ts.contains(95));
    }
}
