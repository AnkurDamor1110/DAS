package TCS;

public class T5_SumTable {
    public static void main(String[] args) {
        int n=10;

        int sum=0;

        for(int i=1;i<=10;i++){
            int p = n * i;
            sum += p;
        }

        System.out.println(sum);
    }
}
