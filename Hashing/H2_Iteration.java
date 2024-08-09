package Hashing;
import java.util.*;
public class H2_Iteration {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 50);
        hm.put("Nepal", 5);
        hm.put("US", 50);
        hm.put("Indonesia", 25);

        //Iterations
        Set<String> keys = hm.keySet();
        // for pair set hm.entrySet();
        //forEach loop 
        for(String key : keys){
            System.out.println("Key = " + key + ", value = " + hm.get(key));
        }
    }
}
