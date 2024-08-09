package Functions;

public class digit_sum {
    public static int sum(int digit){
        int sumDigit=0;
        while(digit > 0){
            int ld = digit % 10;
            sumDigit += ld;
            digit/=10;
        }
        return sumDigit;
    }
    public static void main(String[] args) {
        System.out.println(sum(123));
    }
}
