package Stack_Ex;
import java.util.*;
public class S6_reverseStack {
    public static void pushAtB(Stack<Integer> s , int data){

        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtB(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){

        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtB(s, top);
    }
    public static void main(String[] args) {
       Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
       //3,2,1
        reverseStack(s);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
            //1,2,3
        }
    }
    }

