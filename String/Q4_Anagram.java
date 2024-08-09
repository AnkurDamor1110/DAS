package String;

public class Q4_Anagram {
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        int arr[]=new int[26];
        
        //increase arrry
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            arr[ch-'a']++;
        }
        //decrease arry
        for(int i=0;i<b.length();i++){
            char ch = b.charAt(i);
            arr[ch-'a']--;
            
        }
        
        for(int i=0;i<26;i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        String str = "ApnaCollege".replace("l", "");
        System.out.println(str);

    }
}
