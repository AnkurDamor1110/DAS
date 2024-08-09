package Divide_conque;

public class D3_rotatedArray {

    public static int searchRotated(int arr[],int si,int ei,int tar){
        if( si > ei){
            return -1;
        }

        int mid = si +(ei - si )/2;

        if(arr[mid] == tar ){
            return mid;
        }

        // mid on L1 
        if(arr[si] <= arr[mid]){
            // case:a left
            if(arr[si] <= tar && tar <= arr[mid]){
                return searchRotated(arr, si, mid-1, tar);
            } else {
                // case:b  right 
                return searchRotated(arr, mid+1, ei, tar);
            }
        } else {
            // mid on L2 
            // case: c Right 
            if(arr[mid] <= tar && tar <= arr[ei]){
                return searchRotated(arr, mid+1, ei, tar);
            } else {
                // case: D left 
                return searchRotated(arr, si, mid-1, tar);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int ans = searchRotated(arr, 0, arr.length-1, 0);
        System.out.println(ans);
    }   
}
