package ArrayList;
import java.util.*;
public class A2_reverse {

    public static void reverse(ArrayList<Integer> list){
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(75);
        list.add(98);
        list.add(88);
        System.out.println(list);
        reverse(list);
        
    }
}
