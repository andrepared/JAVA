package Arrays;

public class TwoDArrays {
    public static void main(String args[]) {

        // int[][] A = new int[2][5];
        // int[][] B = { { 1, 2, 3, 4, 5 }, { 3, 6, 1, 4, 5 } };

        // for(int i=0;i<B.length;i++){

        // for (int j = 0; j < B[0].length; j++) {
        // System.out.println(B[i][j]);
        // }
        // }
        // for(int x[]:B)
        // {
        // for(int y:x)
        // {
        // System.out.println(y);
        // }
        // }

        int A[][];
        A = new int[3][];
        A[0] = new int[2];
        A[1] = new int[5];
        A[2] = new int[4];

        // for(int i=0;i<A.length;i++){
        // for (int j = 0; j < A[i].length; j++) {
        // System.out.println(A[i][j]);
        // }

        for (int x[] : A) {
            for (int y : x) {
                System.out.println(y + " ");
            }
            System.out.println("");
        }

    }
}
