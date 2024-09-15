package TCS;

public class T2_UniquePath {
    public static void main(String[] args) {
        int n=3;
        int m=7;

        int dp[][] = new int[n][m];

        for(int i=0;i<dp.length;i++){
            dp[i][0]=1;
        }

        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=1;
        }

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        System.out.println(dp[n-1][m-1]);
    }
}
