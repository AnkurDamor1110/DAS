package Hashing;
import java.util.*;
public class H1_Operations {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        //insert 
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        System.out.println(hm);        

        // get value 
        int populations = hm.get("India");
        System.out.println(populations); // print key's values

        System.out.println(hm.get("Indonesia")); // NULL value beacuse Indonesia's key and value not exit in hash map

        //containskey 
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));
        //containsvalue
        System.out.println(hm.containsValue(100));
        System.out.println(hm.containsValue(200));

        // remove 
        System.out.println(hm.remove("China"));
        System.out.println(hm.remove("Indonesia"));
        System.out.println(hm);

        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        //hm.clear();
        System.out.println(hm.isEmpty());
    }
}
