package Recursion;

public class Q4_StringSE {

    public static void continuousString(String str,int idx,boolean arr[],String sb){
        if(idx == str.length()){
            return;
        }

        char ch = str.charAt(idx);
        if(arr[ch - 'a'] == true){
            sb+=ch;
            System.out.println(sb);
            continuousString(str, idx+1, arr, "");
        } else {
            System.out.println(ch);
            arr[ch - 'a'] = true;
            continuousString(str, idx+1, arr, sb + ch);
        }
    }
    public static void main(String[] args) {
        continuousString("abcab", 0, new boolean[26], "");
    }
}
