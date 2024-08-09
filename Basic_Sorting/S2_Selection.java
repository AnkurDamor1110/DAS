package Basic_Sorting;

public class S2_Selection {
    public static void Selectionsort(int num[]){

        for(int i=0;i<num.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<num.length;j++){
                if(num[minpos]>num[j]){
                    minpos=j;

                }
            }
            //swap
            int temp=num[minpos];
            num[minpos]=num[i];
            num[i]=temp;
        }
    }

    public static void printArray(int num[]){

        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args) {
        int num[]={5,4,1,3,2};
        Selectionsort(num);
        printArray(num);
    }
}
