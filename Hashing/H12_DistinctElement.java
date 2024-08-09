package Hashing;

import java.util.HashSet;

public class H12_DistinctElement {

    public static int DistinctElement(int arr[]){
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }

        return hs.size();
    }
    public static void main(String[] args) {
        int arr[]= {4,3,2,5,6,7,3,4,2,1};

        System.out.println(DistinctElement(arr));


    }
}
