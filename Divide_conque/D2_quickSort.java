package Divide_conque;

public class D2_quickSort {

    public static void quickSort(int arr[],int si,int ei){
        if(si >= ei ){
            return;
        }
        int pivot = partition(arr,si,ei);
        quickSort(arr, si, pivot -1);    //left
        quickSort(arr, pivot+1, ei);   //right

    }

    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1; // to make place for elements smaller than pivot

        for(int j=si;j<ei;j++){
            if(arr[j] < pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // pivot swap
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i]= temp; 
        
    return i;
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {7,10,3,8,2};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
