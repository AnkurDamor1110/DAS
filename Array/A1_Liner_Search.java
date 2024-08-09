package Array;

public class A1_Liner_Search {
    public static int liner(int number[],int key){

        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static int  menu(String ch[],String key2){

        for(int i=0;i<ch.length;i++){
            if(ch[i]==key2){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = { 1, 2, 25, 55, 99, 102, 10, 25, 23, 5 };
        String ch[]={"samosa","kachori","Piza","Khaman"};
        int key =99;
        String key2="Piza";
        int index=liner(number, key);
        int index2=menu(ch, key2);
        if(index == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("The key of "+ key +" index is "+ index);
        }
        
        if(index2 == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("The key of "+ key2 +" index is "+ index2);
        }

    }
}
