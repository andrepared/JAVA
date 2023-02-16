package Arrays;

public class RecBinSearch {

    public static int recBinSearch(int arr[], int l, int h, int key) {

    if (h >= l) {
    int mid = l + (h - l) / 2;
    if (arr[mid] == key) {
    return mid;
    }

    if (arr[mid] > key) {
    return recBinSearch(arr, l, mid - 1, key);
    } else {
    return recBinSearch(arr, mid + 1, h, key);
    }
    }
    return -1;
    }

    public static void main(String args[]){
    int arr[] = { 1, 2, 3, 4, 5, 10, 11, 20 };
    int key = 10;
    int h = arr.length - 1;
    int result = recBinSearch(arr, 0, h, key);
    if (result == -1){
    System.out.println("Element not found!");

    } else
    System.out.println("Element found at index: " + result);
    }
  
}