package Recursion;

public class R2_printNumIncr {
    public static void printIncreasing(int n){
       if(n==1){
        System.out.print(n+" ");
        return;
       }
        printIncreasing(n-1);
       System.out.print(n+" ");
    }
    public static void main(String[] args) {
        printIncreasing(7);
    }
}
