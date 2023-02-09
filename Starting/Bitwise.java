public class Bitwise {
    public static void main(String args[])
    {
        int x = 8;
        int y = 11;

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println(x);
        System.out.println(y);

    
    }
}
