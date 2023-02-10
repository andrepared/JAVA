package Arrays;

// public class BinSearch {
//     public static void missingNumber(int arr[], int l, int h, int key) {
//         int mid = (l + h) / 2;
//         while (l <= h) {
//             if (arr[mid] < key) {
//                 l = mid + 1;
//             } else if (arr[mid] == key) {
//                 System.out.println("Element is found at index " + mid);
//                 break;
//             } else {
//                 h = mid - 1;
//             }
//             mid = (l + h) / 2;
//         }
//         if (l > h) {
//             System.out.println("Element is not found!");
//         }

//     }
//         public static void main(String args[]){
//             int arr[] = { 10, 20, 30, 40, 50 };
//             int key = 40;
//             int h = arr.length -1;
//             missingNumber(arr, 0, h, key);
            
//             }
//     }   
    

public class BinSearch {
    public static void missingNumber(int arr[], int l, int h, int key) {
        int mid = (l + h) / 2;
        while (l <= h) {
            if (arr[mid] < key)
                l = mid + 1;
            else if (arr[mid] == key) {
                System.out.println("Element found at index " + mid);
                break;
            }else{
            h = mid -1;
            }
            mid = (l+h)/2;
            }
            if(l>h){
                System.out.println("Element not found!");     
            }
        }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,10,20,21,35,40};
        int key = 1;
        int h = arr.length -1;
        missingNumber(arr, 0, h, key);
        }

    }
// Time Complexity Big O (logn)