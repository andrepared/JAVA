



class BitwiseDemo
{

    public static void main(String args[])
    {
        int x =-0b1010,
         y; 

        y=~x;
        System.out.println(String.format("%s", Integer.toBinaryString(x)));  
        System.out.println(String.format("%32s", Integer.toBinaryString(y)));  

    }
    
}
