package Array_2D;

public class starircase_search {
    public static boolean starir_search(int matrix[][],int key){
        int row=0,col=matrix[0].length-1;
        while(row<matrix.length && col >=0){
            if(matrix[row][col] == key){
                System.out.println("key Found At (" + row +"," + col + ")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }

        }
        System.out.println("Key Not Found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                        {14,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
                    
                        int key =33;
                        starir_search(matrix,key);
    }
}
