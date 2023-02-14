package Arrays;

import java.util.Arrays;

public class DeleteAndShift {

    public static void main(String args[]) {
        // int[] arr = { 3, 1, 6, 5, 2, 8, 4 };
        // int[] newArr = null;
        // int elementToBeRemoved = 5;
        // System.out.println("Original Array is: " + Arrays.toString(arr));

        // for(int i = 0; i < arr.length-1; i++)
        // {
        // if(arr[i]== elementToBeRemoved)
        // {
        // newArr = new int[arr.length - 1];
        // for(int index=0; index<i; index++)
        // {
        // newArr[index] = arr[index];
        // }
        // for (int j = i; j < arr.length -1; j++) {
        // newArr[j] = arr[j + 1];

        // }
        // break;
        // }
        // }
        // System.out.println("New Array after deleting element = " +elementToBeRemoved
        // +
        // " and shifting: " + Arrays.toString(newArr));
        int[] original = { 1, 3, 6, 5, 8, 8, 2, 4 };
        int[] newArr = null;
        int key = 8;
        System.out.println("This is the original array: " + Arrays.toString(original));

        // Constructing new array
        for (int i = 0; i < original.length - 1; i++) {
            if (original[i] == key) {
                newArr = new int[original.length - 1];
                for (int index = 0; index < i; index++) {
                    newArr[index] = original[index];
                }
                // shifting elements
                for (int j = i; j < original.length - 1; j++) {
                    newArr[j] = original[j + 1];
                }
                break;
            }
        }
        System.out.println("New Array after deleting element = " + key +
                " and shifting: " + Arrays.toString(newArr));
    }

}
