package Basic_Sorting;

public class S1_Bubble {

    public static void BubbleSort(int num[]){
         int swap=0;
        for(int turn=0;turn<num.length-1;turn++){
            
            for(int j=0;j<num.length-1-turn;j++){
                if(num[j]>num[j+1]){
                int temp=num[j];
                num[j]=num[j+1];
                num[j+1]=temp;
                swap++;
                }
               
            }
             if(swap==0)
            {
                System.out.println("NIKAL PAHELI FUR..... IS SORTED ");
                return;
            }
        }
    }

    public static void printArray(int num[]){

        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args) {
        int num[]={10,22,3,44,55};
        BubbleSort(num);
        printArray(num);
    }
}
