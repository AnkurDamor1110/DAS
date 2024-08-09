package Backtracking;

public class gridways {

    public static int getGridways(int i,int j,int n,int m){
        //base case 
        if(i == n-1 && j == m-1){
            return 1;
        } else if(i ==n || j == m){
            return 0;
        }

        int w1 = getGridways(i+1, j, n, m);
        int w2 = getGridways(i, j+1, n, m);

        return w1+w2;
    }
    public static void main(String[] args) {
        System.out.println(getGridways(0, 0, 3, 3));
    }
}
