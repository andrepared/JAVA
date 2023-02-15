package Arrays;

import java.util.Scanner;

public class KeySearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A[] = { 3, 4, 5, 6, 7, 8, 9, 20, 22, 33, 44 };
        int key;
        System.out.println("Please enter a special key");
        key = sc.nextInt();

        for (int i = 0; i < A.length; i++) {
            if (key == A[i]) {
                System.out.println("Element found!");
                System.exit(0);
            }
            System.out.println("Element not found");
        }
    }
}
