package String;
import java.util.*;
public class Q1_lowercase_conut {
    public static int count_lowercase(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            // char ch = Character.toUpperCase(str.charAt(i));
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Emter String: ");
        String str =sc.nextLine();
        System.out.println(count_lowercase(str));
        sc.close();
    }
}
