package Recursion;

public class R3_factorial {
    public static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fac=n * factorial(n-1);
        return fac;
    }
    public static void main(String[] args) {
       int fac= factorial(5);
       System.out.println(fac);
    }
}
