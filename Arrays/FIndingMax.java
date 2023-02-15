package Arrays;

public class FIndingMax {
    public static void main(String args) {

        int A[] = { 2, 3, 4, 55, 6, 7, 21 };
        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max)
                max = A[i];
        }
        System.out.println(max);
    }
}
