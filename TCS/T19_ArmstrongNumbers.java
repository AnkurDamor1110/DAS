package TCS;

import java.util.*;

public class T19_ArmstrongNumbers {

    public static boolean isArmstong(int num,int n){
        int number = num;
        int sum =0;
        while(number != 0){
            int lastDigit = number%10;
            sum += Math.pow(lastDigit, n);
            number /=10;
        }

        return num == sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] elements = input.split(",");

        for(String n_str : elements){
            int num = Integer.parseInt(n_str);
            int n = n_str.length();
            if(isArmstong(num,n)){
                System.out.print(num + " ");
            }
        }

        sc.close();

    }
}
