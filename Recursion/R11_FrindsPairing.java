package Recursion;

public class R11_FrindsPairing {
    public static int frindsPair(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice
        //single
        int fnm1=frindsPair(n-1);

        //pair
        int fnm2=frindsPair(n-2);
        int pairways = (n-1) * fnm2;

        return fnm1 + pairways;

    }
    public static void main(String[] args) {
        System.out.println(frindsPair(3));
    }
}
