package TCS;

import java.util.*;

public class T16_IncrementPass {

    public static String addValueToChars(String inputStr, int value){
        StringBuilder sb = new StringBuilder("");

        for(char ch : inputStr.toCharArray()){
            if(Character.isLetter(ch)){
                if(Character.isLowerCase(ch)){
                    sb.append((char) (((ch - 'a' + value) % 26) + 'a'));  // char --> int | int ---> char
                }else{
                    sb.append((char) (((ch - 'A' + value) % 26) + 'A'));
                }
            }else if(Character.isDigit(ch)){
                    sb.append((char) (((ch -'0' + value) % 10) + '0'));
            } else {
                if(ch == '@'){
                    sb.append('#');
                }else {
                    sb.append('@');
                }
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();
        int value = sc.nextInt();
        System.out.println(password);



        System.out.println("change pass : " + addValueToChars(password, value));
        sc.close();
    }
}
