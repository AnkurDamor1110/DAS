package Frist;
import java.util.*;
public class large {
    public static void main (String[] args){
      Scanner sc = new Scanner(System.in);
     System.out.println("Enter a frist Number :");
      int a = sc.nextInt();
      System.out.println("Enter a Second Number :");
      int b =sc.nextInt();

      if(a>b){
        System.out.println(a + " This number is large");
      }
      else {
        System.out.println(b + " This number is laege");
      }
      sc.close();
    }
}
