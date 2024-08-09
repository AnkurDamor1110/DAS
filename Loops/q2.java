package Loops;

import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum_even = 0, sum_odd = 0,choice;

        do{
            System.out.println("Enter a number for sum even or odd ");
           int num = sc.nextInt();

            if (num % 2 == 0) {
                sum_even += num;
            } else {
                sum_odd += num;
            }
            System.out.println("Enter a number 1 for continu and 0 for breck ");
            choice =sc.nextInt();

        }while(choice == 1);
        System.out.println("Sum of even number is " + sum_even);
        System.out.println("Sum of odd number is " + sum_odd);
        sc.close();
    }
}
