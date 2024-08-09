package Array_2D;

public class Q2_sumOf2Row {
    public static int secondRowsum(int matrix[][]){
        int sum=0;
        for(int i=0;i<=matrix.length;i++){
            sum += matrix[1][i];
        }
        return sum ;
    }
    public static void main(String[] args) {
        int matrix[][]={{4,7,8,5},
                        {8,8,7,6},
                        {7,9,4,6}};
            int sum=secondRowsum(matrix);
            System.out.println("Second Row sum is " + sum);

    }
}
