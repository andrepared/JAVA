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

        System.out.println("Enter option:");
        System.out.println(
        "\t----------\n" +
        "\t1.ADD\n" +
        "\t2.SUB\n" +
        "\t3.MUL\n" +
                        "\t4.DIV\n");
        
        Scanner word = new Scanner(System.in);
        String option = word.nextLine();
        // option = word.nextLine();

        switch(option)
        {
            case "ADD":
                System.out.println(num1 + num2);
                break;
            case "SUB":
                System.out.println(num1 - num2);
                break;
            case "MUL":
                System.out.println(num1 * num2);
                break;
            case "DIV":
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Not a valid input, please try again.");
        }
    }
}
