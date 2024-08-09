package Recursion;

public class R9_TilingProblem {
    public static int tilingWays(int n){
            // 2 x n floor size 
          if(n==0 || n==1){
            return 1;
          }   
        //vertical choice
        int firm1= tilingWays(n-1);
        //horizontal choice
        int firm2= tilingWays(n-2);
        
        return firm1 + firm2;
    }
    public static void main(String[] args) {
       System.out.println(tilingWays(4));
    }
}
