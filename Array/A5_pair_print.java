package Array;

public class A5_pair_print {
    public static void printpair(int number[]){
      int totalPair=0;
        for(int i=0;i<number.length;i++){
            int curr =number[i]; // 2,6,7,8,10
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+ curr + "," + number[j] + ")");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("Total pair is "+ totalPair);
    }
    public static void main(String[] args) {
        int number[]={2,6,7,8,10};
        printpair(number);

    }
}
