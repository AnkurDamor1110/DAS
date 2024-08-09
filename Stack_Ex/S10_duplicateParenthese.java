package Stack_Ex;

import java.util.*;

public class S10_duplicateParenthese {

    public static boolean duplicateParenthese(String str) { // Time --> O(n)
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // opening
            // if(ch == '(' || ch == 'a' || ch == 'b' || ch == '+'){
            // s.push(ch);
            // }else{

            // }

            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true; // duplicate
                } else {
                    s.pop();
                }
            } else {
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "(a+b)";

        System.out.println(duplicateParenthese(str));
    }
}
