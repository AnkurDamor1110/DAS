package Recursion;

public class R7_LastOccurenceNum {
    public static int lastOccurence(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int isfond =lastOccurence(arr, key, i+1);
        if(isfond == -1 && arr[i]==key){
            return i;
        }
        return isfond;
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,3};
      
        int index = lastOccurence(arr, 50, 0);
        System.out.println(index);
    }
}
