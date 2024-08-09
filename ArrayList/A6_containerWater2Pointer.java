package ArrayList;

import java.util.ArrayList;

public class A6_containerWater2Pointer {

    public static int maxWater(ArrayList<Integer> height){
        int lp= 0 , rp = height.size()-1;
        int maxWater=0;

        while(lp < rp){
            int minHt = Math.min(height.get(lp),height.get(rp));
            int width = rp - lp;

            int newWater = minHt * width;
            maxWater = Math.max(maxWater, newWater);

            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
         ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(maxWater(height));
    }
}
