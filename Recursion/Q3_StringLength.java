package Recursion;

public class Q3_StringLength {

    public static int stringLength(String str,int count,int idx){
        if(idx == str.length()){
            return count;
        }
       return stringLength(str, count +1, idx+1);
    }
    public static void main(String[] args) {
        System.out.println(stringLength("ankur1110", 0, 0));
    }
}
