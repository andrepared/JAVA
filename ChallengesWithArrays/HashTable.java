package ChallengesWithArrays;


public class HashTable {
    public static void main(String args[]) {
        int a[] = { 3, 7, 4, 9, 12, 6, 1, 11, 2, 10 };
        int h[] = new int[13];
        int n = a.length;
        

        // We take an array of any length, and initialize a new array if the length set
        // to the max value of the original array.

        for (int i = 0; i < n; i++) {
            h[a[i]]++;
        }

        // loop through hashed array and check which index is not incremented, and return that value.
        for (int i = 1; i <=h.length; i++) {
            if (h[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
