package Stack_Ex;

import java.util.*;

public class S9_vaildParenthese {

    public static boolean vaildParenthese(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) { // time --> O(n)
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') { // opening
                s.push(ch);
            } else {
                
                if (s.isEmpty()) {
                    return false; // not any opening
                }

                if ((s.peek() == '(' && ch == ')')
                        || (s.peek() == '[' && ch == ']')
                        || (s.peek() == '{' && ch == '}')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }

        return s.isEmpty();
    }

    public static void main(String[] args) {
        String str = "({{})";
        System.out.println(vaildParenthese(str));
    }
}
