package Arrays;

public class ArrangeStrings {
    public static void main(String args[]) {
        String arr[] = { "java", "pascal", "python", "smallTalk", "ada", "basic" };

        java.util.Arrays.sort(arr);
        for (String x : arr)
            System.out.println(x);

    }
}
