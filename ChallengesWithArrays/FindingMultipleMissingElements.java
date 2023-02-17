package ChallengesWithArrays;

public class FindingMultipleMissingElements {
    public static void main(String args[]) {
        int i = 0;
        int a[] = { 6, 7, 8, 9, 11, 12, 13, 16, 17, 18 };
        int diff = a[0] - 0;
        for (i = 0; i < a.length; i++) {
            if(a[i]-i != diff)
            {
                while(diff<a[i]-i)
                {
                    System.out.println(i + diff);
                    diff++;
                }
            }
        }

    }
}
