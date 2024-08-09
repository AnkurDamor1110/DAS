package Conditional_statement;
import java.util.*;
public class taxt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Income :");
        float income=sc.nextInt();
        float taxt;
        int totalA;

        if(income<500000){
            System.out.println("Your taxt is 0%");
            taxt=0.0f;
            totalA= (int)income;
        }
        else if(income>=500000 && income<1000000){
            System.out.println("Your taxt is 20%");
            taxt=income * 0.2f;
            totalA = (int) (income - taxt);
        }
        else{
            System.out.println("Your taxt is 30%");
            taxt=income * 0.3f;
            totalA = (int) (income - taxt);
        }
        System.out.println("Your tax is "+ taxt);
        System.out.println("Now Your Income is "+ totalA);
        sc.close();
    }
}
