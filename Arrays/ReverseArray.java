package Arrays;

public class ReverseArray {
    static void reverse(int arr[], int n) {
        int[] arrB = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            arrB[j - 1] = arr[i];
            j = j - 1;
        }
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(arrB[k]);
        }

    }

    public static void main(String args[])
    {
        int[] arr = { 10, 20, 30, 40, 50 };
        reverse(arr, arr.length);
    }
}
