package Dynamic_Programming.Part_1;

public class Fibonacci_DP {

    public static int fibonacci(int n,int f[]){
        if(n == 0 || n == 1){
            return n;
        }
        if(f[n] != 0){
            return f[n];
        }
        f[n] = fibonacci(n-1, f) + fibonacci(n-2, f);
        
        return f[n];
    }
    public static int fibTabulation(int n){
        int[] dp = new int[n+1];
        //initalization
        // dp[0] = 0; not write in java already assign as 0 
        dp[1] = 1 ;

        for(int i=2 ;i<=n ; i++){
            //filling --> small to large
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
    public static void main(String[] args) {
        int n=6;
        int[] f = new int[n+1];
        System.out.println(fibonacci(n, f));
        System.out.println(fibTabulation(n));
    }
}
