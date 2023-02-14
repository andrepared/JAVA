package Arrays;

public class LinSearchRecursion {
    static int arr[] = { 5, 15, 6, 9, 4 };

    static int linearSearch(int arr[], int size, int key) {
        if (size == 0) {
            return -1;
        } else if (arr[size - 1] == key) {
            return size - 1; // Return index of found key
        } else {
            return linearSearch(arr, size - 1, key);
        }
    }

    public static void main(String args[]) {
        int key = 9;
        int index = linearSearch(arr, arr.length, key);
        if (index != -1) {
            System.out.println("The element " + key + " is found at " +
                    index + " index of the given array.");
        } else {
            System.out.println("The element at was not found");
        }
    }

}
