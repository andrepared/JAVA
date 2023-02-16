package Arrays;

import java.util.Arrays;

public class MergingTwoArrays {
    public static void main(String args[]) {
        int i = 0, j = 0, k = 0;
        int a[] = { 30, 40, 50, 60 };
        int b[] = { 45, 50, 55, 60, 65 };

        int m = a.length;
        int n = b.length;

        int c1 = m + n;
        int c[] = new int[c1];

        while (i < m && j < n) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else
                c[k++] = b[j++];
        }

        for (; i < m; i++) {
            c[k++] = a[i];
        }
        for (; j < n; j++) {
            c[k++] = b[j];
        }
        System.out.println("Array A is: " + Arrays.toString(a));
        System.out.println("Array B is: " + Arrays.toString(b));
        System.out.println();
        System.out.println("Sorted Merged Array C is:\n");
        for (k = 0; k < c1; k++) {
            System.out.println(c[k]);
        }
    }
}
  