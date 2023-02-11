package relational;

import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int year;
        System.out.println("We are trying to calculate a leap year");
        System.out.println("Please enter a year:");
        year = scan.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                System.out.println("It is NOT leap year.");
            } else if (year % 400 == 0) {
                System.out.println("It is a leap year.");
            } else {
                System.out.println("It is NOT a leap year.");
            }
        } else {
            System.out.println("It is NOT a leap year. Sorry!");
        }
    }
}
