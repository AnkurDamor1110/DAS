package TCS;

import java.util.HashMap;

public class T1_TragetSubarray {
     static void optimalApproach(int[] arr, int n, int target) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int curSum = 0;
        for (int i = 0; i < n; i++) {
            curSum += arr[i];
            if (curSum == target) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
            if (sumMap.containsKey(curSum - target)) {
                int startIndex = sumMap.get(curSum - target) + 1;
                for (int k = startIndex; k <= i; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            sumMap.put(curSum, i);
        }
    }
 
        public  static int subarraySum(int[] nums, int k) {
            HashMap<Integer,Integer> map = new HashMap<>();
            map.put(0,1);
    
            int sum=0;
            int ans=0;
    
            for(int j=0;j<nums.length;j++){
                sum += nums[j];
    
                if(map.containsKey(sum-k)){
                    ans += map.get(sum-k);
                }
    
                map.put(sum,map.getOrDefault(sum,0) + 1);
            }
            return ans;
        }
    
    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, 3, 1, -4};
        int N = arr.length;
        int target = 7;
        optimalApproach(arr, N, target);
        System.out.println();
        System.out.println(subarraySum(arr,target));
    }
}
