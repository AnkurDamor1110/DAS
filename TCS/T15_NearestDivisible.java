package TCS;
import java.util.*;

public class T15_NearestDivisible {

    public static int customRound(double number){
        int integerPart = (int) number;
        double decimal = number - integerPart;

        if(decimal >= 0.5){
            return integerPart +1;
        }else{
            return integerPart;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        sc.nextLine();
        int y = sc.nextInt();

        double nearest = (double) x/y;

        int roundOfNumber = customRound(nearest);

        System.out.println("Newarest number : " + roundOfNumber * y);
        sc.close();
    }
}
