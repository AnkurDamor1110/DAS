package TCS;
import java.util.*;
public class T21_PrintAllcombinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String elements[] = input.split(" ");

        int N = Integer.parseInt(elements[0]);

        StringBuilder sb = new StringBuilder("");

        for (int i = 1; i < elements.length; i++) {
            sb.append(elements[i]);
        }
        System.out.println(sb.toString());
        for(int i=0;i<=N;i++){
            for(int j=i;j<=N;j++){
                for(int k=i;k<=j;k++){
                    if (k != j) {
                        System.out.print(sb.charAt(k) + " ");
                    } else {
                        System.out.print(sb.charAt(k));
                    }
                }
                if(i != N){
                    System.out.print(",");
                }
            }
        }

        sc.close();
        // System.out.println(sb.toString());
    }
}
