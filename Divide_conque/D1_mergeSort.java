package Divide_conque;

public class D1_mergeSort {

    public static void mergeSort(int arr[],int si,int ei){
        if(si >= ei){
            return;
        }

        int mid = si + (ei-si)/2;
        //left part 
        mergeSort(arr, si, mid);
        //right Part
        mergeSort(arr, mid+1, ei);

        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1]; 
        int i=si; // idx for 1st sort part
        int j=mid+1; // idx for 2nd sort part
        int k=0;

        while (i <= mid && j <= ei) {
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            } else {
                temp[k]= arr[j];
                j++;
            }

            k++;
        }
        // leftover element fot 1st part
        while (i <= mid) {
            temp[k++] = arr[i++];
            
        }

        // leftover element fot 1st part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        //copy temp to original arry
        for(k=0,i=si ;k < temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,10,3,8,2};
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
