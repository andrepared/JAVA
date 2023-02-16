package Arrays;

public class MultiplyingTwoDArrays {
    public static void main(String args[]) {
        int[][] A = { { 1, 2, 4 }, { 8, 12, 5 }, { 16, 1, 7 } };
        int[][] B = { { 11, 2, 4 }, { 8, 12, 5 }, { 16, 1, 7 } };
        int C[][] = new int[3][3];

        // for (int i = 0; i < A.length; i++) {
        // for (int j = 0; j < A[0].length; j++) {
        // C[i][j] = A[i][j] + B[i][j];
        // }
        // }
        // for(int x[]:C){

        // for(int y:x)
        // {
        // System.out.println(y + " ");
        // }
        // }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    C[i][j] = C[i][j] + A[i][k] + B[k][j];
                }
            }
        }
        for (int x[] : C) {
            for (int y : x) {
                System.out.println(y);
            }
        }
    }
}
