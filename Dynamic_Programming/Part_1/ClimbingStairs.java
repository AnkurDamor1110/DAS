package Dynamic_Programming.Part_1;

import java.util.Arrays;

public class ClimbingStairs {
    //Recursion --> O(2^n)
    public static int countWays(int n){
        if(n == 0){
            return 1;
        }
        if( n < 0){
            return 0;
        }

        return countWays(n-1) + countWays(n-2);
    }

    // Memoization --> O(n)
    public static int countWaysMemo(int n,int[] dp){
        if(n == 0){
            return 1;
        }
        if( n < 0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = countWaysMemo(n-1 , dp) + countWaysMemo(n-2, dp);

        return dp[n];
    }

    //Tabulation -- >O(n)
    public static int countWaysTabu(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;

        for(int i=1;i<=n;i++){
            if(i == 1){
                dp[i] = dp[i-1];
            }else{
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        for(int i=0;i<dp.length;i++){
            System.out.print(dp[i] +" ");
        }
        System.out.println();
        return dp[n];
    }
    public static void main(String[] args) {
        int n=5;
        // System.out.println(countWays(n));
        int[] dp = new int[n+1];
        Arrays.fill(dp , -1);
        // System.out.println(countWaysMemo(n, dp));
        System.out.println(countWaysTabu(n));
    }
}
