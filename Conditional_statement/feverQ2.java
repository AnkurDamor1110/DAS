package Conditional_statement;
import java.util.*;


public class feverQ2 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter Your Body Temperature");
    double temp=sc.nextDouble();

    if(temp>=100){
        System.out.println("You have Fever!! Pleas Contact Doctor");
    }
    else{
        System.out.println("You don't have Faver !!");
    }
    sc.close();
}
}
