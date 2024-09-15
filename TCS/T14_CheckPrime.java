package TCS;
import java.util.*;


public class T14_CheckPrime {

    public static boolean isPrime(int num){
        if(num == 2){
            return true;
        }else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean calculatSum(int num){
        int sum=0;
        int number = num;
        while (number != 0) {
            int lastDigit = number%10;
            sum += lastDigit;
            number /= 10;
        }

        return isPrime(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();

        for(int i=n;i<=m;i++){
            if(isPrime(i) && calculatSum(i)){
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
