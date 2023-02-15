package Arrays;

public class CopyingAnArray {
    public static void main(String args[]) {

        int A[] = { 2, 3, 4, 5, 6, 7 };
        int B[] = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];


        }

        System.out.println("Array after right rotate: ");
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i] + " ");
        }
    }
}
