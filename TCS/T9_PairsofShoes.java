package TCS;

import java.util.*;
public class T9_PairsofShoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<N;i++){
            String shoesSize = sc.next();

            map.put(shoesSize,map.getOrDefault(shoesSize, 0)+1);
        }

        int pair=0;
        for(String key : map.keySet()){
          
            String opposite;
            if(key.charAt(key.length() - 1) == 'L'){
                opposite = key.substring(0, key.length() - 1) + 'R';
            }else{
                opposite = key.substring(0, key.length() - 1) + 'L';
            }

            if(map.containsKey(opposite)){
                pair += Math.min(map.get(key), map.get(opposite));
            }
        }

        System.out.println("Pairs:" + pair/2);

        sc.close();
    }
}
