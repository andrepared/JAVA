package Arrays;

import java.util.Arrays;

public class FindSum {
    static int findSum(int A[], int sum) {
        sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
        }
        return sum;
    }

    public static void main(String args[]) {
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 18, 43 };
        int result = findSum(A, 0);
        System.out.println(result);

    }

}
