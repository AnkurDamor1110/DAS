package Conditional_statement;
import java.util.*;
public class LargeThreeNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter frist Number ");
        int num1=sc.nextInt();
        System.out.println("Enter second Number ");
        int num2=sc.nextInt();
        System.out.println("Enter third Number ");
        int num3=sc.nextInt();

        if(num1>=num2 && num1>=num3)
        {
           System.out.println("large Number is "+ num1);
        }
        else if(num2>=num3)
        {
            System.out.println("large Number is "+ num2);
        }
        else
        System.out.println("large Number is "+ num3);
        sc.close();
    }
}
