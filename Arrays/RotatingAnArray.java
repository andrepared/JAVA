package Arrays;

import java.util.Arrays;

public class RotatingAnArray {
    public static void main(String args[]) {
        int[] A = { 1, 4, 6, 8, 9, 2 };
        for (int x : A) {
            System.out.println(x + ",");
            System.out.println("");
        }
        int temp = A[0];
        for (int i = 1; i < A.length; i++) {
            A[i - 1] = A[i];

        }
        A[A.length - 1] = temp;

        for (int x : A) 
            System.out.println(x + ",");
            // System.out.println("");
        
    }

}