package TCS;
import java.util.*;

public class T12_sortwithoutlib {

    public static void sort(char arr[]){
        int left=0;
        int mid=0;
        int right = arr.length -1;

        while (mid <= right) {
            if(arr[mid] == '3'){
                char temp = arr[mid];
                arr[mid] = arr[left];
                arr[left] = temp;
                left++;
                mid++;
            } else if(arr[mid] == '6'){
                mid++;
            } else if(arr[mid] == '7'){
                char temp = arr[mid];
                arr[mid] = arr[right];
                arr[right] = temp;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter space-separated elements: ");
        String input = sc.nextLine();

         // Convert the input string to a character array while ignoring spaces
        String cleanedInput = input.replace(",", ""); // Remove spaces
        char arr[] = cleanedInput.toCharArray();

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

        sc.close();
    }
}
