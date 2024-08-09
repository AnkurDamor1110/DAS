
package Conditional_statement;
import java.util.*;
public class weekNameQ3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7");
        int num=sc.nextInt();
        
        switch(num){
            case 1: System.out.println("Toady is Sunday");
                    break;
            case 2: System.out.println("Toady is Monday");
                    break; 
            case 3: System.out.println("Toady is Tuesday");
                    break; 
            case 4: System.out.println("Toady is Wednesday");
                    break;                  
            case 5: System.out.println("Toady is Thursday");
                    break;
            case 6: System.out.println("Toady is Friday");
                    break;
            case 7: System.out.println("Toady is Saturday");
                    break;
            default :
                    System.out.println("invaild Number");               
        }
        sc.close();
    }
}
