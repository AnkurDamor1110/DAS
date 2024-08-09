package Frist;
import java.util.*;

public class linear {

    public static int linear_Search(int a[],int key){
         for(int i=0;i<a.length;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]={2,5,7,9,4,6,8};
        int key =sc.nextInt();
        int index =linear_Search(a,key);
        if(index==-1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("key fount at index "+ index);
        }
        
        sc.close();
    }
   
}
