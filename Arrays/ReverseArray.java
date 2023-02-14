package Arrays;

import java.util.Arrays;

public class ReverseArray {
    static void reverse(int arr[], int n) {
        // int[] arrB = new int[n];
        // int j = n;
        // for (int i = 0; i < n; i++) {
        // arrB[j - 1] = arr[i];
        // j = j - 1;
        // }
        // System.out.println("Reversed array is: \n");
        // for (int k = 0; k < n; k++) {
        // System.out.println(arrB[k]);
        // }

        // }

        // public static void main(String args[])
        // {
        // int[] arr = { 10, 20, 30, 40, 50 };
        // reverse(arr, arr.length);
        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = t;
        }
        
        System.out.println("The reversed array is: \n");
        for (k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
    }

    public static void main(String args[]) {

        int[] arr = { 10, 20, 30, 40, 50 };
        System.out.println("The original array is:" + Arrays.toString(arr));
        reverse(arr, arr.length);
    }
}
