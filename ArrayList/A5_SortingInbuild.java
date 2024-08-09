package ArrayList;
import java.util.*;
import java.util.Collections;
public class A5_SortingInbuild {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(98);
        list.add(75);
        list.add(6);
        list.add(88);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        
        //reverse -- order
        // Collections.sort(list, Collections.reverseOrder());
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
