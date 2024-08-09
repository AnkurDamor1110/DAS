package Frist;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter frist number:");
        int a=sc.nextInt();
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        System.out.println("Ente a choice you want :\n 1.Add number\n2.subtration\n3.Multiplay\n4.Divison\n5.Modulo");
        int choice=sc.nextInt();
        
        switch(choice)
        {
            case 1:
                 {
                    System.out.println("Two number Add");
                    int sum=a+b;
                    System.out.println(sum);
                 }
                 break;
            case 2:
                {
                    System.out.println("Two number subtration");
                    int diff=a-b;
                    System.out.println(diff);
                }
                break;
            case 3:
                 {
                    System.out.println("Two number Multiplay");
                    int mul=a*b;
                    System.out.println(mul);
                 }  
                 break;
            case 4:
                {
                    System.out.println("Two number divison");
                    int div=a/b;
                    System.out.println(div);
                }
                break;
            case 5:
                 {
                     System.out.println("Two number Modulo");
                     int mo=a%b;
                     System.out.println(mo);
                  }
                  break;
            default:
                    System.out.println("invaild choice");                  
        }

        sc.close();
    }
}
