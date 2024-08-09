package String;

public class S1_PrintString {
    public static void printString(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {
        String fristname="Ankur";
        String lastname="Damor";
        String fullname=fristname + " " + lastname;
        System.out.println(fullname);
        printString(fullname);
    }
}
