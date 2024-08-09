package ArrayList;
import java.util.ArrayList;
public class Operation {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
       // ArrayList<String>list1=new ArrayList<>();
        //ArrayList<Boolean> list2 =new ArrayList<>();

        //operation
        //1. add operation
        list.add(1);// time O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        list.add(3,11);
        System.out.println(list);
        //get
     /*   int value= list.get(2);
        System.out.println(value);
        

        //remove 
        list.remove(2);
        System.out.println(list);

        //set element at index
         list.set(2,6);
         System.out.println(list);
         */
         //contains
         System.out.println(list.contains(1));
         System.out.println(list.contains(11));

     
    }
}
