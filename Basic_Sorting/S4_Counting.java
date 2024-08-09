package Basic_Sorting;

public class S4_Counting {

    public static void counting(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1]; // start with 0

        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        int j=arr.length-1;
        for(int i=0;i<count.length;i++){
            
            while (count[i] > 0) {
                arr[j] = i;
                count[i]--;
                j--; 
                if(j == -1) break;          
            }
        }
        

    }
    public static void printArray(int num[]){

        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args) {
        int num[]={5,4,1,3,2};
        counting(num);
        printArray(num);
    }
}
