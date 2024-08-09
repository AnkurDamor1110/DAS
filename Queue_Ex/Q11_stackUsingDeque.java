package Queue_Ex;
import java.util.*;
public class Q11_stackUsingDeque {

    static class Stack {
        static Deque<Integer> deque = new LinkedList<>();

        //push
        public static void push(int data){
            deque.addLast(data);
        }

        //pop
        public static int pop(){
            if(deque.isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            int top = deque.removeLast();
            return top;
        }

        //peek
        public static int peek(){
            if(deque.isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            
            return  deque.getLast();
        }
    }
    public static void main(String[] args) {
        Stack.push(5);
        Stack.push(6);
        Stack.push(7);

        System.out.println(Stack.pop());
        System.out.println(Stack.pop());
        System.out.println(Stack.pop());
    }
}
