package Stack_Ex;
import java.util.*;
public class S11_maxRectangularArea {

    public static int maxArea(int arr[]){
        int maxArea =0;
        int nsr[] = new int[arr.length];
        int nsl[]= new int[arr.length];
        
        //next smaller right
        Stack<Integer> s = new Stack<>();
        for(int i= arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //next smaller left
        s = new Stack<>();
        // s.clear();
        for(int i= 0; i<arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //current area : j-i-1 --> nsr[i] - nsl[i] - 1

        for(int i=0;i<arr.length;i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currentArea = height * width;
            maxArea = Math.max(maxArea, currentArea);
        }
        return maxArea;

    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};

        System.out.println(maxArea(arr));
    }
}
