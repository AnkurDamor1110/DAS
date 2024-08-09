package Oops;

public class oops {
    public static void main(String arge[]){
        pen p1 = new pen();
        p1.Setcolor("Bule");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color ="red";
        System.out.println(p1.color);
        p1.tip=6;
        System.out.println(p1.tip);
        Bank p2 =new Bank();
        p2.username ="Ankur"; 
        //p2.password="uh@nd"; // private variable
        p2.setpassword("ghdk");
    }
}
class Bank{
    public String username;
    private String password;
     void setpassword(String pwd){
        password =pwd;
        System.out.println(password);
     }

}
class pen{
    String color;
    int tip;

    void Setcolor(String newcolor){
        color=newcolor;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}