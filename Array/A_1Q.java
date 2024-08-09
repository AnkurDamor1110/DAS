package Array;
import java.util.*;
public class A_1Q {
    public static boolean twice_array(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    return true;
                    
                }
                
                  
            }
        }
        return false;
    }



    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        System.out.println(twice_array(num));
        sc.close();
    }

    
}
