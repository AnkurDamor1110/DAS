package TCS;
import java.util.*;

public class T17_fiveThreeDivisible {

    public static String solve(String elements[]){
        StringBuilder sb = new StringBuilder("");

        for(String str : elements){
            int num = Integer.parseInt(str);

            if(num%3 == 0 && num%5 == 0){
                sb.append("ThreeFive ");
            }else if(num%3 ==0){
                sb.append("Three ");
            }else if(num%5 == 0){
                sb.append("Five ");
            }else{
                sb.append(num).append(" ");
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();

        input = input.replaceAll("[\\[\\]]", ""); // remove '[' and  ']'
        String elements[] = input.split("\\s+");

        //add in arrayList 

        // ArrayList<String> arr = new ArrayList<>();
        // for(String str : elements){
        //     arr.add(str);
        // }

        System.out.println("Ans: " + solve(elements));

        sc.close();
    }
}
