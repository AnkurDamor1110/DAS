package Array;

public class A8_MaxSubArry_PreFix {
    public static void PrefixArray(int num[]){
        int curr_sum=0;
        int maxSum=Integer.MIN_VALUE;
        int preFix[]=new int[num.length];
        preFix[0]=num[0];
        for(int i=1;i<preFix.length;i++){
            preFix[i]=preFix[i-1]+num[i];
        }

        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                curr_sum= start == 0 ? preFix[end] : preFix[end]-preFix[start-1];
                System.out.print(curr_sum+" ");
                if(curr_sum>maxSum){
                    maxSum=curr_sum;
                }
            }
            System.out.println();
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int num[] = { 1,-2,6,-1,3 };
        PrefixArray(num);
    }
}
