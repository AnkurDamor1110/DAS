package Backtracking;

public class B2_Subsets {
    public static void subset(String str,String ans,int i){
        //bass case
        if(i == str.length()){
            if(ans.length()==0){
                System.out.println("NULL");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //recursion
        //Yes choice 
        subset(str, ans+str.charAt(i), i+1);
        //no choice
        subset(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "ab";
        subset(str,"", 0);
    }
}
