package TCS;
import java.util.*;

public class T18_SequenceQuestion {

    public static boolean isPositiveInteger(String str){
        for(char ch : str.toCharArray()){
            if(!Character.isDigit(ch)){
                return false;
            }
        }

        return !str.isEmpty() && Integer.parseInt(str) > 0 ;
    }

    public static ArrayList<Integer> generateSequence(int n){
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(n);
        while (n != 1) {
            if(n % 2 == 0){
                n /= 2;
            }else {
                n = 3*n+1;
            }
            list.add(n);
        }

        return list;
    }

    public static int[] maxLengthOfSequenceAndK(int n){
        int maxLen=0, kValue=0;

        for(int i=1;i<=n;i++){
            ArrayList<Integer> list = generateSequence(i);
            int currentLen = list.size();

            if(maxLen < currentLen){
                maxLen = currentLen;
                kValue =i;
            }

        }

        return new int[]{maxLen,kValue};
    }
    public static int[] maxSequenceValueAndK(int n){
        int maxValue = Integer.MIN_VALUE;
        int k = 0;

        for(int i=1;i<=n;i++){
            ArrayList<Integer> list = generateSequence(i);
            int currentLen = list.size();

            for(int j=0;j<currentLen;j++){
                if(maxValue < list.get(j)){
                    maxValue = list.get(j);
                    k =i;
                }
            }

        }

        return new int[]{maxValue,k};

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n_str = sc.next();

        if(isPositiveInteger(n_str)){
            int n = Integer.parseInt(n_str);
            ArrayList<Integer> sequence = new ArrayList<>();
            sequence = generateSequence(n);
            int[] maxLen_kValue = maxLengthOfSequenceAndK(n);
            int[] maxValue_k = maxSequenceValueAndK(n);
            System.out.print("Sequence: [");
            for(int i=0;i<sequence.size();i++){
                System.out.print(sequence.get(i));
                if(i != sequence.size()-1){
                    System.out.print(",");
                }
            }
            System.out.print("]");
            System.out.println();
            System.out.println(maxLen_kValue[0] + " " + maxLen_kValue[1]);
            System.out.println(maxValue_k[0] + " " + maxValue_k[1]);
        }else{
            System.out.println("Error!");
        }
        sc.close();
    }
}
