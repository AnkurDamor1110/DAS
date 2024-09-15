package TCS;
import java.util.*;
public class T23_SumofUniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input =sc.nextLine();

        String elements[] = input.split(",");

        ArrayList<Integer> list = new ArrayList<>();
        for(String str : elements){
            int num = Integer.parseInt(str);
            list.add(num);
        }
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int num : list){
            map.put(num,map.getOrDefault(num, 0)+ 1);
        }
        int sum =0;
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                sum += key;
            }
        }

        System.out.println("Sum is " + sum);

        sc.close();

    }
}
