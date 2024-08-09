package Recursion;

public class Q1_PrintKeyIdx {
    public static void printIdx(int arr[],int key,int idx){
        if(idx == arr.length){
            return ;
        }
        if(arr[idx] == key){
            System.out.print(idx + " ");
        }
         printIdx(arr,key,idx+1);
        //  return;
    }
    public static void main(String[] args) {
        int arr[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
        printIdx(arr,2,0);
    }
}
