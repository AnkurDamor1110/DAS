package Hashing;
import java.util.*;
public class H6_MajorityElement {

    public static ArrayList<Integer> majorityNum(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            // if(map.containsKey(arr[i])){
            //     map.put(arr[i], map.get(arr[i])+1);
            // }else{
            //     map.put(arr[i], 1);
            // }
            map.put(arr[i],map.getOrDefault(arr[i], 0 ) + 1);
        }
         //Set<Integer> keys = map.keySet();
           for (Integer key : map.keySet()) {
                if(map.get(key) > arr.length/3){
                     list.add(key);
                }
           } 
        return list;
    }
    public static void main(String[] args) {
        int arr[]={1,3};
        System.out.println(majorityNum(arr));
    }
}
