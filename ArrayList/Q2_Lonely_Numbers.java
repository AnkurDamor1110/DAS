package ArrayList;

import java.util.*;
import java.util.Collections;
public class Q2_Lonely_Numbers {
    public static ArrayList<Integer> lonelyNum(ArrayList<Integer> nums){
        Collections.sort(nums);
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<nums.size()-1;i++){
            if(!(nums.contains(nums.get(i)+1) || nums.contains(nums.get(i)-1)) && nums.get(i) != nums.get(i+1)){
                list.add(nums.get(i));
            }
            
        }
        System.out.println(list);
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);
       ArrayList<Integer> list = lonelyNum(nums);
       System.out.println(list);
    }
}
