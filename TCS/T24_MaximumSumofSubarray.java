package TCS;
import java.util.*;

public class T24_MaximumSumofSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        input = input.replaceAll("[\\[\\]]", "");
        String elements[] = input.split(",");

        ArrayList<Integer> list  = new ArrayList<>();

        for(int i=0;i<elements.length;i++){
            int num = Integer.parseInt(elements[i]);
            list.add(num);
        }

        int cs=0;
        int ms = Integer.MIN_VALUE;
        boolean allNagative = true;

        for(int i=0;i<list.size();i++){
            cs += list.get(i);
            if(list.get(i) >= 0){
                allNagative = false;
            }
            if(cs  < 0){
                cs =0;
            }
            ms =Math.max(ms, cs);
        }

        if(allNagative){
            ms=list.get(0);
            for(int i=0;i<list.size();i++){
                ms =Math.max(ms,list.get(i));
            }
        }

        System.out.println("max sum subArray : " + ms);
        sc.close();
    }
}
