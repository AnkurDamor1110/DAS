package Hashing;
import java.util.*;
public class H5_TreeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm =new TreeMap<>();

        tm.put("india", 100);
        tm.put("China", 90);
        tm.put("US", 50);
        tm.put("Nepal", 5);

        System.out.println(tm); // sort base on keys 
    }
}
