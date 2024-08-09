package ArrayList;
import java.util.*;
public class A3_MaxNum {
    public static int MaxNum(ArrayList<Integer> list){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i) > max){
                max= list.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(75);
        list.add(98);
        list.add(88);
        System.out.println(MaxNum(list));
    }
}
