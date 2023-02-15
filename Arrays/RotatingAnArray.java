package Arrays;

import java.util.Arrays;

public class RotatingAnArray {
    public static void main(String args[]) {
        // int[] A = { 1, 4, 6, 8, 9, 2 };
        // for (int x : A) {
        // System.out.println(x + ",");
        // System.out.println("");
        // }
        // int temp = A[0];
        // for (int i = 1; i < A.length; i++) {
        // A[i - 1] = A[i];

        // }
        // A[A.length - 1] = temp;

        // for (int x : A)
        // System.out.println(x + ",");
        // // System.out.println("");

        // Right rotate of an array
        int[] A = { 2, 3, 4, 5, 6, 7 };
        int n = 3;

        for (int x : A)
            System.out.println(x + ",");
        System.out.println("");

        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i] + "");
        }
        
        for (int i = 0; i < n; i++) {
            int j, last;
        
            last = A[A.length - 1];
        
        for(j=A.length-1;j>0;j--){
            A[j] = A[j - 1];
        }
        A[0] = last;
        }
        System.out.println();

        System.out.println("Array after right rotate: ");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i] + " ");
        }
    }
}