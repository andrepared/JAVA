package relational;

import java.util.Scanner;


public class DayInAWeek {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a day in the week. (Hint)\n" +
                "It has to be a number");
        int day;
        day = scan.nextInt();
        if (day ==1)
        {
            System.out.println("It is Monday");
        }else if(day ==2)
        {
            System.out.println("It is Tues");
        }
        else if (day == 3) {
            System.out.println("It is Wed");
        }
        else if (day == 4) {
            System.out.println("It is Thurs");
        }
        else if(day ==5)
        {
            System.out.println("It is Fri");
        }
        else if (day == 6) {
            System.out.println("It is Sat");
        }
        else if (day == 7) {
            System.out.println("It is Sun");
        }
    }    
}
