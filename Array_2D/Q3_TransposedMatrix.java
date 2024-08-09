package Array_2D;

public class Q3_TransposedMatrix {


    public static void printArray(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transposed(int matrix[][]){
        int n=matrix[0].length; //row--->colmn
        int m=matrix.length; // colmn--->row
        int transMatrix[][] = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i == j){
                    transMatrix[i][j] = matrix[i][j];
                }else{
                    transMatrix[i][j] = matrix[j][i];
                }
            }
        }
        printArray(transMatrix);
    }

    
    public static void main(String[] args) {
        int matrix[][]={{4,7,8,5},
                        {8,8,7,6},
                        {7,9,4,6}};
        printArray(matrix);
        transposed(matrix);
    }
}
