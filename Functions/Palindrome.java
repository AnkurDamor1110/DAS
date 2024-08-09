package Functions;

public class Palindrome {

    public static boolean pali_num(int n){
        int my_num=n;
        int reverse=0;
        while(my_num != 0){
            int ld = my_num % 10;
            reverse = reverse * 10 + ld;
            my_num/=10;
        }
        if(reverse == n){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(pali_num(121));
    }
}
