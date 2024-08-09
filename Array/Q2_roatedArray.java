package Array;

public class Q2_roatedArray {

    public static int privotIdx(int arr[]) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            // case:1
            if (mid < e && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // case:2
            if (mid > s && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // case:3
            if (arr[s] >= arr[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int arr[], int left, int right, int traget) {
        int s = left;
        int e = right;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == traget) {
                return mid;
            }
            if (arr[mid] > traget) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }

    public static int search(int arr[],int traget ){
        int pivot = privotIdx(arr);

        if (pivot == -1) {
           return  binarySearch(arr, 0, arr.length -1, traget);
        }

        if (arr[pivot] == traget) {
            return pivot;
        } else if (traget >= arr[0]) {
            return binarySearch(arr, 0, pivot - 1, traget);
        } else {
           return binarySearch(arr, pivot + 1, arr.length - 1, traget);
        }
    }

    public static void main(String[] args) {
        int arr[] = {  };
        int traget = 3;
        
        System.out.println(search(arr, traget));
    }
}
