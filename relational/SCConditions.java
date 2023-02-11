package relational;

import java.util.Scanner;

public class SCConditions {
    // Even or odd?
    // public static void main(String args[]) {
    // int n;

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a number");
    // n = sc.nextInt();
    // if (n % 2 == 0) {
    // System.out.println("It is an even number");
    // } else {
    // System.out.println("It is an odd number");
    // }
    // }
    // Young or old condition statement
    public static void main(String args[]) {
        int age;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        age = sc.nextInt();

        if (age < 14 && age > 0)
        {
            System.out.println("You are a little bb!!");
        } else if (age > 14 && age <= 55) {
            System.out.println("You are young!");
        } else if (age > 55 && age <85){
            System.out.println("Sorry you are old!");
        } else 
        {
            System.out.println("Sorry you are super old!");
        } 
    }
}
