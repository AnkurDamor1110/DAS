package Backtracking;

public class B1_ChangeArray {

    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void changearray(int arr[],int i,int val){
        //bas case
        if(i == arr.length){
            printarray(arr);
            return;
        }
        //recursion
        arr[i]=val;
        changearray(arr, i+1, val+1);     // function call Setp
        arr[i]=arr[i]-2;                  // Backtracking Step 
        
    }

    public static void main(String[] args) {
        int arr[]=new int[5];
        changearray(arr, 0, 1);
        printarray(arr);
    }
}
