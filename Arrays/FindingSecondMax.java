package Arrays;

public class FindingSecondMax {
    public static void main(String args[]) {
        int[] A = { 12, 13, 44, 55, 23, 41, 34, 5 };
        int max1, max2;
        max1 = max2 = A[0];
        for (int i = 0; i < A.length; i++) {

            if (A[i] > max1) {
                max2 = max1;
                max1 = A[i];
            } else if (A[i] > max2) {
                max2 = A[i];
            }

        }
        System.out.println("Seecond largest element is: " + max2);
    }
}