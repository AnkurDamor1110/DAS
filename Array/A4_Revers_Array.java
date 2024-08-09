package Array;

public class A4_Revers_Array {
    public static void revers(int number[]){
        int start=0,end=number.length-1;
        while(start < end){
            int temp =number[end];
            number[end]=number[start];
            number[start]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int number[]={2,5,10,1,65};
        revers(number);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+ " ");
        }
    }
}
