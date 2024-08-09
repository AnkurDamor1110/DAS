package Hashing;
import java.util.*;

public class H10_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(5);
        lhs.add(55);
        lhs.add(65);
        lhs.add(89);
        lhs.add(16);
        lhs.add(95);

        // insertion oder mantain 
        System.out.println(lhs);

        lhs.remove(55);

        for (Integer integer : lhs) {
            System.out.print(integer +  " ");
        }
        System.out.println();

        System.out.println(lhs.contains(645));
    }
}
