package Hashing;
import java.util.*;
public class H8_HashSetOper {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(5);
        set.add(6);
        set.add(5);

        System.out.println(set);

        System.out.println(set.contains(5));
        System.out.println(set.contains(50));

        set.remove(1);
        System.out.println(set.contains(1));

        System.out.println(set);
        
        System.out.println(set.size());

        set.clear();
        System.out.println(set.isEmpty());
    }
}
