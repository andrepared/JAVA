package Arrays;

public class BinSearch {
    public static void missingNumber(int arr[], int l, int h, int key) {
        int mid = (l + h) / 2;
        while (l <= h) {
            if (arr[mid] < key) {
                l = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index " + mid);
                break;
            } else {
                h = mid - 1;
            }
            mid = (l + h) / 2;
        }
        if (l > h) {
            System.out.println("Element is not found!");
        }

    }
        public static void main(String args[]){
            int arr[] = { 10, 20, 30, 40, 50 };
            int key = 40;
            int h = arr.length -1;
            missingNumber(arr, 0, h, key);
            
            }
    }   
    

