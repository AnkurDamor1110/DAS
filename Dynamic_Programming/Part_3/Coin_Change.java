package Dynamic_Programming.Part_3;

public class Coin_Change {
    public static int coinChange(int coin[], int sum){
        int n = coin.length;
        int dp[][] = new int[n+1][sum+1];

        for(int i=0;i<n+1;i++){
            dp[i][0] = 1;
        }

        for(int j=1;j<sum+1;j++){
            dp[0][j] = 0;
        }

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){

                if(coin[i-1] <= j){ // vaild
                    dp[i][j] = dp[i][j-coin[i-1]] + dp[i-1][j];
                                //include           //exculde
                } else { // invaild
                    dp[i][j] = dp[i-1][j];
                    //exculde
                }
            }
        }

        return dp[n][sum];
    }
    public static void main(String[] args) {
        int coin[]={1,2,3};
        int sum = 4;

        System.out.println(coinChange(coin, sum));

    }
}
