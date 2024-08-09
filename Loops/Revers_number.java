package Loops;
import java.util.*;
public class Revers_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a NUmber");
        int num=sc.nextInt();
        int lastDig;
        while(num>0){
            lastDig=num%10;
            System.out.print(lastDig);
            num/=10;
        }
        sc.close();
    }
}
