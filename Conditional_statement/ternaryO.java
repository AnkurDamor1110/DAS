package Conditional_statement;

public class ternaryO {
    public static void main(String[] args) {
        int num=4;
        //even and odd with ternary operator
        String type =((num%2)==0) ? "Even":"Odd";   // variable =Condition ? Statement1 :statement2 ;
        System.out.println(type);
    }
}
