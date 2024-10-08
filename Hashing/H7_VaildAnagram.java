package Hashing;

import java.util.*;

public class H7_VaildAnagram {
    public static boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();
        
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.containsKey(ch)) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }

            // if (map.isEmpty()) {
            //     return true;
            // }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        String s = "car";
        String t = "rac";
        System.out.println(isAnagram(s, t));
    }
}
