package String;

public class S4_SubString {
    public static String Substring(String str,int start,int end){
        String SubString="";
        for(int i=start;i<end;i++){
            SubString += str.charAt(i);
        }
        return SubString;

    }
    public static void main(String[] args) {
        String str ="HelloWorld";
        System.out.println(Substring(str, 3, 5));
        //In Java
       System.out.println( str.substring(0,5));
    }
}
