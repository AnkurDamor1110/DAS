package String;

public class S6_builder {
    public static String name(String s){
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=Character.toUpperCase(s.charAt(i));
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch ='a';ch<='z';ch++){ //O(26)
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(name("ankur"));
    }
    
}
