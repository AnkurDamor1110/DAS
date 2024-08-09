package Loops;
import java.util.*;
public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number=sc.nextInt();
        boolean isPrime=true;
        if(number == 2){
            System.out.println(number +" This is prime Number");
        }
        else{
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i == 0){
                isPrime=false;
            }
        }
        if(isPrime==true){
            System.out.println(number+ " This is Prime Number");
        }
        else {
            System.out.println(number +" This is not prime Number");
        }
    }
    sc.close();
    }
}
