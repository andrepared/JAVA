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
    // public static int[] addX(int n, int arr[], int x) {
    //     int i;
    //     int newArr[] = new int[n + 1];

    //     for (i = 0; i < n; i++)
    //         newArr[n] = x;

    //     return newArr;
    // }

    public static void main(String args[]) {
        int[] A = new int[10];
        A[0] = 3;
        A[1] = 9;
        A[2] = 7;
        A[3] = 8;
        A[4] = 12;
        A[5] = 6;

        int n = 6;
        for (int i = 0; i<n; i++) {
            System.out.println(A[i] + " ");
            System.out.println();
        }

        int x = 20;
        int index = 2;
        
        for (int i = n; i > index; i--) {
            A[i] = A[i = 1];
            A[index] = x;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(A[i] + " ");
            System.out.println();
        }
    }

}
