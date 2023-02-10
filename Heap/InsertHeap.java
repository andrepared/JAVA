package Heap;

public class InsertHeap {
   
static void insertHeap(int A[], int n)
{
    int temp, i = n;
    temp = A[i];
    while (i > 1 && temp > A[i / 2]) {
        A[i] = A[i / 2];
        i = i / 2;
    }
     A[i] = temp;
}

// Creating Heap Function 

static void createHeap()
{
    int [] A = {0,10,20,30,25,5,40,35};
    int i;

    for( i=2; i <=7; i++)
    {
        insertHeap(A, i);
    }

};
public static void main(String arg[])
{
   createHeap();
}
}
