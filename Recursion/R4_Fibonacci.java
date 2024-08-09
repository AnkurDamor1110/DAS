package Recursion;

public class R4_Fibonacci {

    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fib1= fibonacci(n-1);
        int fib2= fibonacci(n-2);
        return fib1+fib2;
    }
    public static void main(String[] args) {
        int fib=fibonacci(6);
        System.out.println(fib);
    }
}
