package Loops;

import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for fac..");
        int num = sc.nextInt();
        int fac = 1;
        while (num > 1) {
            fac *= num;
            num--;
        }
        System.out.println(fac);
        sc.close();
    }
}
