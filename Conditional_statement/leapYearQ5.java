package Conditional_statement;
import java.util.*;
public class leapYearQ5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Year");
        int year=sc.nextInt();
        
        boolean x= (year%4) ==0;
        boolean y= (year%100) !=0;
        boolean z= ((year%100==0) && (year%400==0));

        if(x  && (y||z)) 
        {
            System.out.println(year+" is a leap year");
        }
    else{
        System.out.println(year+" is not a leapyear");
     }
     sc.close();
    }
}
