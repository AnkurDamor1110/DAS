package Frist;
public class test1 {
    public static void min_max(int num[]){
       
        int currSum=0,maxSum=Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                    currSum += num[k];   
                }
                System.out.print(" "+ currSum);
                if(currSum > maxSum){
                    maxSum=currSum;
                }
                
            }
            
        }
        System.out.println("sum "+ maxSum);
    }
    public static void main(String[] args) {
        int num[]={1,-2,6-1,3};
        min_max(num);
    }
}
