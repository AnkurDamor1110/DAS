package Hashing;
import java.util.*;
public class H4_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 50);
        lhm.put("Nepal", 5);
        System.out.println(lhm); // print in insertion oder
        //get 
        System.out.println(lhm.get("India"));

        //contains key 
        System.out.println(lhm.containsKey("Nepal"));

        //remove
        System.out.println(lhm.remove("China"));
    }
}
