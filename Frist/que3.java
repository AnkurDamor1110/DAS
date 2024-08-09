package Frist;
import java.util.Scanner;
public class que3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter item name");
        String item1= sc.next();
        System.out.println("Enter item price");
        float pencil =sc.nextFloat();

        System.out.println("Enter item name");
        String item2= sc.next();
        System.out.println("Enter item price");
        float pen =sc.nextFloat();

        System.out.println("Enter item name");
        String item3= sc.next();
        System.out.println("Enter item price");
        float eraser =sc.nextFloat();
        System.out.println("Your items are --->>");
        System.out.println(item1);
        System.out.println( item2);
        System.out.println( item3);
        float cost = (pencil +pen +eraser);
         System.out.print("Your total cost is ");
         System.out.println(cost);
         int total= (int)cost;
         System.out.println("Now you have to pay "+total);
         float gst = cost * 0.18f;
         System.out.print("GST is ");
         System.out.println(  gst);
         System.out.print("Total cost now include GST ");
         System.out.println(cost + gst);
         int total1=(int)(cost + gst);
         System.out.println("Your total amount (includeing GST) "+ total1);
         sc.close();
    }
}
