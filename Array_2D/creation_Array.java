package Array_2D;
import java.util.*;

class creation_Array{

    public static void input(int matrix[][]){
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        sc.close();
    }
    public static void print(int matrix[][]){
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        int matrix[][]=new int[3][3];
        input(matrix);
        print(matrix);
        
    }
}