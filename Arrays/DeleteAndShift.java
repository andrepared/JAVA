package Arrays;

import java.util.Arrays;
import java.util.List;

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

        // Use ArrayList to Remove Element from Array and Shift in Java
        Integer[] arr = { 3, 1, 6, 4, 2, 8 };
        int elementToBeRemoved = 2;

        System.out.println("Original Array: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToBeRemoved) {
                arr = removeElementUsingCollection(arr, i);
                break;
            }
            System.out.println("Array after removing element: " + elementToBeRemoved);
            for (int j = 0; j < arr.length; j++) {
                System.out.println(" " + arr[j]);
            }
        }
    }
    public static Integer[] removeElementUsingCollection(Integer[] arr, int index) {
        List<Integer> tempList = new ArrayList<Integer>(Arrays.asList(arr));
        tempList.remove(index);
        return tempList.toArray(new Integer[0]);
    }
}
