package Basic_Sorting;

public class S3_Insertion {

    public static void InsertionSort(int num[]){

        for(int i=1;i<num.length;i++){
            int curr=num[i]; // temp storg
            int prev=i-1;
            while(prev>=0 && num[prev] > curr){
                num[prev+1]=num[prev]; // 
                prev--;
            }
            num[prev+1]=curr; // set empty space 
        }
    }
    public static void printArray(int num[]){

        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }


    public static void main(String[] args) {
        int num[]={5,4,1,3,2};
       InsertionSort(num);
        printArray(num);
    }
}
