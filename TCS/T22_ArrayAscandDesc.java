package TCS;
import java.util.*;


public class T22_ArrayAscandDesc {

    public static void printSort(HashMap<String,Integer> map , boolean revesrs){
        ArrayList<String> list = new ArrayList<>(map.keySet());

        if(revesrs){
            Collections.sort(list,Collections.reverseOrder());
        }else{
            Collections.sort(list);
        }

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String elements[] = input.split(" ");

        HashMap<String,Integer> map =new HashMap<>();

        for(String fruit : elements){
            map.put(fruit, map.getOrDefault(fruit, 0)+1);
        }

        printSort(map,false);
        printSort(map, true);

        sc.close();

    }
}
