package Backtracking;

public class B3_Permutations {
    public static void getPermutations(String str,String ans){
        //base case 
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<str.length();i++){  // use for loop beacuse of we need all character choices
            char ch = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            getPermutations(newStr, ans+ch);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        getPermutations(str, "");
    }
}
