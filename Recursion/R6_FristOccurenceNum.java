package Recursion;

public class R6_FristOccurenceNum {
    public static int fristOccurence(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return fristOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={5,6,2,5,1,3,5,6,8};
        int i=0;
       int index = fristOccurence(arr, 50, i);
       System.out.println(index);
    }
}
