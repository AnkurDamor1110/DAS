package TCS;
import java.util.*;
public class T20_TopKStudents {

    public static class Pair implements Comparable<Pair>{
        int mark;
        String name;

        public Pair(int m,String n){
            this.mark = m;
            this.name = n;
        }
        @Override
        public int compareTo(Pair p2 ){
            return p2.mark - this.mark;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String elements[] = input.split(" ");

        int k = Integer.parseInt(elements[0]);
        // int N = Integer.parseInt(elements[1]);

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i=2;i<elements.length; i += 2){
            int mark = Integer.parseInt(elements[i]);
            String name = elements[i+1];

            pq.add(new Pair(mark, name));
        }

        for(int i=0;i<k;i++){
            Pair curr = pq.remove();
            System.out.println(curr.name+":"+curr.mark);
        }

        sc.close();
    }
}
