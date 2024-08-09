package Queue_Ex;
import java.util.*;
public class Q5_QueueUsingStack {

    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        //add
        public static void add(int data){  // time --> O(n)

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        //remove 

        public static int remove(){ // Time --> O(1)
            if(s1.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            return s1.pop();
        }

        //peek 

        public static int peek(){  //Time --> O(1)
            if(s1.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            return s1.peek();
        }
        
    }
    public static void main(String[] args) {
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);

        while (!Queue.isEmpty()) {
            System.out.println(Queue.peek());
            Queue.remove();
        }
    }
}
