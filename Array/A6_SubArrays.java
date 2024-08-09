package Array;

public class A6_SubArrays {
    public static void printSubArray(int num[]) {
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;
        int count;
        int totalSubArray = 0;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                count = 0;
                for (int k = start; k <= end; k++) { // Print

                    System.out.print(num[k] + " "); // SubArray
                    count += num[k];  
                }
                if (max_sum < count) {
                    max_sum = count;
                }
                if (min_sum > count) {
                    min_sum = count;
                }
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SunArray is " + totalSubArray);
        System.out.println("MAX sum is " + max_sum);
        System.out.println("MIN sum is " + min_sum);
    }

    public static void main(String[] args) {
        int num[] = { 2, 6, 4, 8, 10 };
        printSubArray(num);
    }
}
