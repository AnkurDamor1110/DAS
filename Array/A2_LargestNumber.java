package Array;


public class A2_LargestNumber {
    public static int getlargest(int number[]){
    
        int largest=Integer.MIN_VALUE; //  -   infinity
        int smallest=Integer.MAX_VALUE;//  +   infinity
        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }
            if(smallest>number[i]){
                smallest =number[i];
            }
    
        }
        System.out.println("The smallest number is "+ smallest);
        return largest;
    
    }
    public static void main(String[] args) {
        int number[]={5,66,8,50,2,69,56};
        System.out.println("The largest number is "+ getlargest(number));

    }
}
