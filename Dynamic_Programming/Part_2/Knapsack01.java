package Dynamic_Programming.Part_2;

public class Knapsack01 {

    public static int recursionKnapsack(int[] val,int[] wt,int w,int n){

        if(w == 0 || n == 0){
            return 0;
        }

        if(wt[n-1] <= w){ // vaild
            //include 
            int ans1 = val[n-1] + recursionKnapsack(val, wt, w-wt[n-1], n-1);
            //exclude
            int ans2 = recursionKnapsack(val, wt, w, n-1);

            return Math.max(ans1, ans2);

        } else { // not vaild
           return recursionKnapsack(val, wt, w, n-1);
        }

    }

    //Memoization
    public static int memoization(int[] val,int[] wt,int w,int n,int[][] dp){
        if(w == 0 || n == 0){
            return 0;
        }
        if(dp[n][w] != -1){
            return dp[n][w];
        }

        if(wt[n-1] <= w){ // vaild
            // include
            int ans1 = val[n-1] + memoization(val, wt, w - wt[n-1], n-1, dp);
            //exclude
            int ans2 = memoization(val, wt, w, n-1, dp);

            dp[n][w] = Math.max(ans1, ans2);
            return dp[n][w];

        } else { // not Vald

            dp[n][w] = memoization(val, wt, w, n-1, dp);
            return dp[n][w];
        }
    }

    // Tabulation

    public static int tabulation(int[] val,int[] wt, int W){
        int n = val.length;
        int[][] dp = new int[n+1][W+1];

        for(int i=0;i<dp.length;i++){
            dp[i][0] = 0;
        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j] = 0;
        }

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                
                int v= val[i-1];
                int w = wt[i-1];

                if(w <= j){ // vaild
                    int incProfit = v + dp[i-1][j-w];
                    int excProfit = dp[i-1][j];

                    dp[i][j] = Math.max(incProfit, excProfit);
                } else {
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit; 
                }
            }
        }
        printDPMatrix(dp);
        return dp[n][W];
    }
    
    
    
    public static void printDPMatrix(int[][] dp){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] val = {15,14,10,45,30};
        int[] wt = {2,5,1,3,4};
        int w =7;

        System.out.println(recursionKnapsack(val, wt, w, val.length));
        int[][] dp = new int[val.length+1][w+1];

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }

        // System.out.println(memoization(val, wt, w, val.length, dp));

        System.out.println(tabulation(val, wt, w));
    }
}
