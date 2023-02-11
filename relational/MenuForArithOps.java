package relational;
import java.util.Scanner;

public class MenuForArithOps {
    public static void main(String args[])    
    {
        System.out.println("\tMenu\n" +
        "\t----------\n" +
        "\t1.ADD\n" +
        "\t2.SUB\n" +
        "\t3.MUL\n" +
                "\t4.DIV\n");
        int num1, num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter option:");
        System.out.println(
        "\t----------\n" +
        "\t1.ADD\n" +
        "\t2.SUB\n" +
        "\t3.MUL\n" +
                        "\t4.DIV\n");
        
        
        String option = sc.nextLine();
        // option = word.nextLine();
        option = option.toUpperCase();
        switch(option)
        {
            case "ADD":
                System.out.println("Sum is " + (num1 + num2));
                break;
            case "SUB":
                System.out.println("Difference is " + (num1 - num2));
                break;
            case "MUL":
                System.out.println("Product is " + (num1 * num2));
                break;
            case "DIV":
                System.out.println("Ratio is " + (num1 / num2));
                break;
            default:
                System.out.println("Not a valid input, please try again.");
        }
    }
}
