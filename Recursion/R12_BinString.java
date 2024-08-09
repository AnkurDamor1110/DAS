package Recursion;

public class R12_BinString {
    static String nums[] = {"Zero", "One", "Two", "Three" ,"Four" , "Five" , "Six" , "Seven" , "Eghit" , "Nine"};

    public static void printBinString(int n,int lastPlace, String str){

        if(n==0){
            System.out.println(str);
            return;
        }

        printBinString(n-1, 0, str + "0");

        if(lastPlace == 0){
            printBinString(n-1, 1, str + "1");
        }
    }

    public static void printIdxKey(int arr[],int key,int idx){

        if(idx == arr.length){
            return;
        }
        if(arr[idx] == key){
            System.out.print(idx + " ");
            printIdxKey(arr, key, idx + 1);
        } else {
            printIdxKey(arr, key, idx + 1);
        }
    }

    public static void PrintWrods(int n){
        if(n == 0){
            return;
        }

        int lastDigit = n % 10;
         n = n/10;
         PrintWrods(n);

         System.out.print(nums[lastDigit] + " ");
    }
    public static void main(String[] args) {
        // printBinString(3, 0, "");

        // int arr[]={3,2,4,5,6,2,7,2,2};
        // printIdxKey(arr, 2, 0);
        PrintWrods(25550);
    }
}
