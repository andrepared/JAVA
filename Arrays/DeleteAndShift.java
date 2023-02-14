package Arrays;

import java.util.Arrays;

public class DeleteAndShift {

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 7, 8 };
        int j = 3;
        System.out.println("Before deletion" + Arrays.toString(arr));
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == j) {
                count++;
            }
            for (int k = i; k < arr.length; k++) {
                arr[k] = arr[k + 1];
            }
            count--;

        }
        System.out.println("After deletion: ");
        for (int i = 0; i < arr.length - count; i++) {
            System.out.println(" " + arr[i]);
        }

        System.out.println("Entire Array: " + Arrays.toString(arr));
    }
}
