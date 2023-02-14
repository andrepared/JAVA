package Arrays;

import java.util.Arrays;


public class DeleteAndShift {

    // Shifting elements in the same array
    public static void main(String args[]) {
        int[] arr = new int[] { 1, 3, 3, 4, 5 };
        int j = 3;
        System.out.println("Before deletion: " + Arrays.toString(arr));
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == j) {
                count++; //Checking for dupes
            }
            //Shifting elements
            for (int k = i; k < arr.length -1; k++) {
                arr[k] = arr[k + 1];
            }
            i--;
            break;
        }
    System.out.println("After Deletion: " );
    for (int i = 0; i < arr.length - count; i++) {
        System.out.print(" " + arr[i]);
    }
    System.out.println();
    System.out.println("Array after shifting: "+ Arrays.toString(arr));
    
    }
}
