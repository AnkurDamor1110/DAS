package TCS;

import java.util.*;
public class T7_ORsSubarray {
      public static int subarrayBitwiseORs(int[] arr) {
        HashSet<Integer> result = new HashSet<>();
        HashSet<Integer> current = new HashSet<>();

        for(int num : arr){
            HashSet<Integer> newCurrent = new HashSet<>();

            newCurrent.add(num);

            for(int prve : current){
                newCurrent.add(prve | num);
            }

            current = newCurrent;

            result.addAll(current);
        }

        return result.size();
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2};

        System.out.println(subarrayBitwiseORs(arr));
    }
}
