package Dynamic_Programming.Part_3;

public class Rod_Cutting {
    public static int rodCutting(int lengths[],int price[],int rodlen){
        int n = price.length;
        int dp[][] = new int[n+1][rodlen+1];

        // initilization ---> 0 

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){

                if(lengths[i-1] <= j){
                    dp[i][j] = Math.max( price[i-1] + dp[i][j-lengths[i-1]], dp[i-1][j]);
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][rodlen];
    }
    public static void main(String[] args) {
        int lengths[]={1,2,3,4,5,6,7,8};
        int price[]= {1,5,8,9,10,17,17,20};
        int rodlen =8;

        System.out.println(rodCutting(lengths, price, rodlen));
    }
}
