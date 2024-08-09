
package Conditional_statement;
import java.util.*;
public class posi_negaNumberQ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        if(num>=0){
            System.out.println( num + " This number is Positive");
        }
        else{
            System.out.println( num + " This number is Nagative");
        }
        sc.close();
    }
}
