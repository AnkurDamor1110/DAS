package Stack_Ex;
import java.util.*;
public class S8_nextGreaterNum {
    public static void main(String[] args) {  // time --> O(n)
        int arr[]= {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for(int i=arr.length-1; i >=0 ; i--) {
            //1 while loop
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){  // time --> O(2n)
                s.pop();
            }
            //2 if-else 
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[s.peek()];
            }
            //3 push in s
            s.push(i);
        }

        for(int i=0 ;i<nextGreater.length;i++) {
            System.out.print(nextGreater[i]+" ");
        }
    }
}
