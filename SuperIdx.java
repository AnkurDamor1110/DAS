import java.util.*;
public class SuperIdx {

    public static void helper(int arr[],int a,int b){
        arr[a] = b;
        int superidx = sIdx(arr);

        System.out.println(superidx);
    }

    public static int sIdx( int[] arr){
        for (int i=0;i<arr.length;i++){
            if(arr[i] > arr[i+1]){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();

        while (test-- > 0) {
            int n = s.nextInt();
            int arr[] = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = s.nextInt();
            }

            int q = s.nextInt();

            for(int i =0;i<q;i++){
                int a = s.nextInt();
                int b= s.nextInt();

                helper(arr,a,b);
            }
        }
        s.close();
    }
}
