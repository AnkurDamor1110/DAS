package TCS;
import java.util.*;

public class T13_MissingNumber {

    public static int missingNumber(ArrayList<Integer> arr,int N){
        int totalSum=0;
        int n = N+1;
        for(int num : arr){
            totalSum += num;
        }
        int actualSum = (n *(n+1))/2;
        return actualSum - totalSum;
    }

    public static int missingNumber2( String[] token,int N){
        int totalSum = 0;
        int n=N+1;
        for(String str : token){
            int num = Integer.parseInt(str);
            totalSum += num;
        }
        int actualSum = (n *(n+1))/2;
        return actualSum - totalSum;
    }

    public static void input_space_separated(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter space-separated elements: ");
        int N = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();


        String[] token = input.split(" ");
        // Scanner ss = new Scanner(input);
        // ArrayList<Integer> arr = new ArrayList<>();
        // while (ss.hasNextInt()) {
        //     arr.add(ss.nextInt());
        // }

        System.out.println("Missing Number : " + missingNumber2(token, N));
        sc.close();
        // ss.close();
    }
    public static void  input_array_format(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter elements in format e1,e2,e3: ");
        int N = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();

        String[] token = input.split(",");
        // ArrayList<String> arr = new ArrayList<>();

        // for(String str: token){
        //     arr.add(str);
        // }

        System.out.println("Missing Number :"+ missingNumber2(token, N));
        sc.close();

    }
    public static void main(String[] args) {
        input_space_separated();
        // input_array_format();
    }
}
