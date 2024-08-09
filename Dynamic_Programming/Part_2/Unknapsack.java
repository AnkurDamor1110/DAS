package Dynamic_Programming.Part_2;

public class Unknapsack {
    public static int unknapsack(int val[],int wt[],int W){
        int n = val.length;
        int dp[][] = new int[n+1][W+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){

                if(wt[i-1] <= j){
                    // include
                    int ans1 = val[i-1] + dp[i][j-wt[i-1]] ; // change for unknapsack from dp[i-1][j-wt[i-1]]
                    // exculed
                    int ans2 = dp[i-1][j];

                    dp[i][j] = Math.max(ans1, ans2);
                } else {
                    // not include 
                    dp[i][j] = dp[i-1][j];
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
        int[] val = {15,14,10};
        int[] wt = {2,5,1};
        int w =3;

        System.out.println(unknapsack(val, wt, w));
    }
}
