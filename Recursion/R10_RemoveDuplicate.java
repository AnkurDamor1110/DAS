package Recursion;

public class R10_RemoveDuplicate {
    public static void RemoveDuplicate(String str,int idx,StringBuilder newstr,boolean map[] ){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar= str.charAt(idx);
        if(map[currchar - 'a'] == true){
            RemoveDuplicate(str, idx+1, newstr, map);
        }else{
            map[currchar - 'a'] = true;
            RemoveDuplicate(str, idx+1, newstr.append(currchar), map);
        }
    }
    public static void main(String[] args) {
        boolean map[] = new boolean[26];
        String str = "aannkkuurr"; // only small character
        RemoveDuplicate(str,0, new StringBuilder(""), map);
    }
}
