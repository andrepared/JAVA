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
        // int age;

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter your age: ");
        // age = sc.nextInt();

        // if (age < 14 && age > 0)
        // {
        //     System.out.println("You are a little bb!!");
        // } else if (age >= 14 && age <= 55) {
        //     System.out.println("You are young!");
        // } else if (age > 55 && age <85){
        //     System.out.println("Sorry you are old!");
        // } else 90
        // {
        //     System.out.println("Sorry, you are super old!");
        // } 
        int m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three marks please,");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();

        float avg = (float) (m1 + m2 + m3) / 3;
        if (avg >= 70)
        {
            System.out.println("Grade A");
        }else if(avg>=60 && avg < 70){
            System.out.println("Grade B");
        } else if (avg>=50 && avg < 60)
        {
            System.out.println("Grade C");
        } else if (avg >=40 && avg < 50)
        {
            System.out.println("Grade D");
        } else 
        {
            System.out.println("You failed.");
        }

    }
}
