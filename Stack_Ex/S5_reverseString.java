package Stack_Ex;
import java.util.*;
public class S5_reverseString {
    public static String reverseString(String str){
        Stack<Character> s =new Stack<>();
        int idx=0;
        while (idx < str.length() ) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");

        while (!s.isEmpty()) {
            result.append(s.pop());
        }

        return result.toString();
    } 
    public static void main(String[] args) {
        String str ="Ankur";
        System.out.println(reverseString(str));
    }
}
