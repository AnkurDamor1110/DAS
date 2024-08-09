package Queue_Ex;
import java.util.*;
public class Q12_queueUsingDeque {
    static class Queue {
        
        static Deque<Integer> deque = new LinkedList<>();

        //add
        public static void add(int data){
            deque.addLast(data);
        }

        //remove
        public static int remove(){
            if(deque.isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int top = deque.removeFirst();
            return top;
        }

        //peek
        public static int peek(){
            if(deque.isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            
            return  deque.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue.add(5);
        Queue.add(6);
        Queue.add(7);

        System.out.println(Queue.remove());
        System.out.println(Queue.remove());
        System.out.println(Queue.remove());
    }
}
