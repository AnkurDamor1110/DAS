package TCS;

import java.util.Arrays;

public class T10_maximumProduct {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int num1=nums[n-1];
        int num2 = nums[n-2];
        int num3 = nums[n-3];

        //negative 

        int numN1=nums[0];
        int numN2 = nums[1];

         return Math.max(num1*num2*num3,num1*numN1*numN2);
    }
    public static void main(String[] args) {
        int nums[] ={8,9,5,3,2,1};


        System.out.println(maximumProduct(nums));
    }
}
