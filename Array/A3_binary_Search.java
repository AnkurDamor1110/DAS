package Array;

public class A3_binary_Search {
    public static int binarySearch(int number[],int key){
         
        int start=0;
        int end=number.length-1;
        while(start<=end){
            int mid =(start + end) /2;  // mid = start + (end - start) / 2
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={2,5,6,40,50,68,75,90};
        int key=75;
        System.out.println(binarySearch(number, key));
    }
}
