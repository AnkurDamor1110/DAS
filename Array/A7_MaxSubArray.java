package Array;

public class A7_MaxSubArray {
    public static void printSubArray(int num[]) {
        int curr_sum = 0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                curr_sum=0;
                for (int k = start; k <= end; k++) { //Print
                    
                    curr_sum +=num[k];
                    
                }
                
                System.out.println(curr_sum);
                if(curr_sum>maxSum){
                  maxSum=curr_sum;
                }
            }
            
        }
        System.out.println("Total SunArray is " + maxSum);
    }

    public static void main(String[] args) {
        int num[] = { 2, 6, 7, 8, 10 };
        printSubArray(num);
    }
}
