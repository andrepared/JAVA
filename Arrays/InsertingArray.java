package Arrays;

import java.lang.*;
import java.util.*;

public class InsertingArray {

    // static int inserting(int A[], int index, int i, int x)
    // {
    // if(index>= 0 && index<=A.length)
    // {
    // for (i = A.length; i > index; i--) {
    // A[i] = A[i - 1];
    // }
    // return A[index] = x;
    // }
    // public static void main(String args[])
    // {
    // int A[] = {2,3,4,5,6,7}

    // }
    // }
    public static int[] addX(int n, int arr[], int x) {
        int i;
        int newArr[] = new int[n + 1];

        for (i = 0; i < n; i++)
            newArr[n] = x;

        return newArr;
    }

    public static void main(String args[]) {
        int n = 10;
        // initial size of array
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Initial Array\n" + Arrays.toString(arr));

        int x = 50;

        arr = addX(n, arr, x);

        System.out.println("\nArray with " + x +
                " add:\n" +
                Arrays.toString(arr));
    }

}
