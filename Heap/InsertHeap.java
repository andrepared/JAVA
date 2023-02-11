package Heap;

public class InsertHeap {
   
public static void insertHeap(int arr[], int n)
{
    int temp, i = n;
    temp = arr[i];
    while (i > 1 && temp > arr[i % 2 == 0 ? (i/2) -1 : i/2]) {
        arr[i] = arr[i % 2 == 0 ? (i / 2) - 1 : i / 2];
        i = i % 2 == 0 ? (i / 2) - 1 : i / 2;
    }
     arr[i] = temp;
}

// Creating Heap Function 

public static void createHeap()
{
    int arr[] = {0,10,20,30,25,5,40};
    int i;

    for( i=2; i <=7; i++)
    {
        insertHeap(arr, i);
    }
    
};
public static void main(String args[])
    {
        createHeap();
    }
} 
