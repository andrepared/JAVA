package Methods; 

public class MethodPractice {
    // static void update(int A[]) {
    //     A[0] = 25;
    // }

    // public static void main(String args[]) {
    //     int A[] = { 1, 2, 3, 4, 5, 6 };
    //     update(A);
    //     System.out.println(A[0]);
    //     }
    int max(int x, int y)
    {
        return x > y ? x : y;
    }

    String userName(String email)
    {
        int a = email.indexOf("@");
        String name = email.substring(0, a);
        return name;

    }

}