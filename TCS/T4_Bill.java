package TCS;

import java.util.HashMap;
import java.util.Scanner;

public class T4_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Double> map = new HashMap<>();
        int n=3;
        double maxCost=0;
        String maxItem="";
        double itemPrice=0;

        for(int i=0;i<n;i++){
            System.out.println("Enter item");
            String item = sc.nextLine();
            double quantity = sc.nextDouble();
            double price = sc.nextDouble();

            sc.nextLine();

            itemPrice = quantity * price;

            map.put(item,map.getOrDefault(item, 0.0) + itemPrice);

            if(maxCost < map.get(item)){
                maxCost = map.get(item);
                maxItem = item;
            }
        }

        // total price
        double totalPrice=0;
        for(String key : map.keySet()){
            totalPrice += map.get(key);
        }

        //avg 
        double avg = totalPrice/n;


        totalPrice = Math.round(totalPrice * 100.0) / 100.0;
        avg = Math.round(avg * 100.0) / 100.0;

        System.out.println(map);
        System.out.println();
        System.out.println("Higher selling item: "+ maxItem);
        System.out.println("selling total price:"+ totalPrice);
        System.out.println("Avg. price:"+ avg);
        sc.close();
    }
}
