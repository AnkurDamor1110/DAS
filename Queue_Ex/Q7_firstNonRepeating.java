package Queue_Ex;
import java.util.*;
public class Q7_firstNonRepeating {
    public static void printNonRepeating(String str){
        int feq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            feq[ch - 'a']++;
            q.add(ch);

            while(!q.isEmpty() && feq[q.peek() - 'a'] > 1 ){
                q.remove();
            }

            if(q.isEmpty()){
                System.out.print(-1 + " ");
            }else {
                System.out.print(q.peek() + " ");
            }
        }
        // System.out.println();
    }
    public static void main(String[] args) {
        String str="aabccxb";
        printNonRepeating(str);
    }
}
