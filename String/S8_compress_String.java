package String;

public class S8_compress_String {
    public static String String_Compress(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count >1){
                sb.append(count.toString());
            }

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str ="aabbccccdd";
        System.out.println(String_Compress(str));
        
        
    }
}
