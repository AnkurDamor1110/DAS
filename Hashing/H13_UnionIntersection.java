package Hashing;

import java.util.*;
public class H13_UnionIntersection {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};

        //union 

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }

        System.out.println("Union of this sets is "+ set.size());

        for (Integer integer : set) {
            System.out.print(integer+ " ");
        }

        System.out.println();

      

        //Intersection 
        set.clear();

        int intersection=0;
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                intersection++;
                set.remove(arr2[i]);
                System.out.print(arr2[i] +" ");
            }
        }
        System.out.println();
        System.out.println("Intersection os this sets is "+ intersection);
    }
}
