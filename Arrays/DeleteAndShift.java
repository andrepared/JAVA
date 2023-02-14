package Arrays;

import java.util.Arrays;
import java.util.ArrayList;

public class DeleteAndShift {

    // Deleting elements by its value when the array contains duplicates
    public static void main(String args[]) {
        int[] arr = new int[] { 1, 3, 3, 4, 5 };
        ArrayList<Integer> arr_new = new ArrayList<>();
        int j = 3;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=j){
                arr_new.add(arr[i]);
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + arr_new);
    }
}
