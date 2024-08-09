package Loops;
import java.util.*;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for table.");
        int num = sc.nextInt();
        int i =1;
        while(i<=10){
            int ans = num * i;
            System.out.println(num + " X " + i +" = "+ ans );
            i++;
        }
        sc.close();
    }
}
