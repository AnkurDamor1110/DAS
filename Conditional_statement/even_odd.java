package Conditional_statement;
import java.util.*;
public class even_odd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number ");
        int num1=sc.nextInt();
        
        
        if(num1%2==0){
            System.out.println("This is Even Number");
        }
        else
            System.out.println("This is odd Number");

           sc.close();
    }
}
