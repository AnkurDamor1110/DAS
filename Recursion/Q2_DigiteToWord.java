package Recursion;

public class Q2_DigiteToWord {
     static String word[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"}; // 0-9
     
     public static void wordNum(int n){
        if(n ==0){
            return;
        }
        int lastDigit = n % 10;
        wordNum(n/10);
        System.out.print(word[lastDigit]+" ");
     }

     public static int sumOfDigit(int n){
        if( n == 0){
            return 0;
        }
        int lastDigit = n%10;

        return lastDigit + sumOfDigit(n/10);
     }
    public static void main(String[] args) {
        int n=2019;
        // wordNum(n);

        int ans = sumOfDigit(n);
        System.out.println(ans);
    }
}
