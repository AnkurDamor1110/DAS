package Functions;

public class binomial_Coeff {

    public static int factorial(int n) {
        int fac=1;
        for(int i=1;i<=n;i++){
            fac *= i;
        }
        return fac;
    }
    public static int binomial_Coef(int n ,int r) {
         int a = factorial(n);
         int b = factorial(r);
         int c = factorial(n-r);
        int bc = a /(b*c);
        return bc;
    }
    public static void main(String[] args) {
         int n =5,r=2;
         System.out.println(binomial_Coef(n, r));
    }
}
