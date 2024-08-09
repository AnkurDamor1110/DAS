package Hashing;

// import java.util.HashSet;
import java.util.*;

public class H9_IterationSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(5);
        set.add(99);
        set.add(56);
        set.add(85);
        set.add(55);

        // 1. Using iterator 
            // Iterator it =set.iterator();
            
            // while (it.hasNext()) {
            //     System.out.print(it.next() + " ");
            // }

        // 2. using for each loop 
        
        for (Integer key : set) {
            System.out.println(key);
        }

        //3. using default method
            System.out.println(set);
            
    }
}
