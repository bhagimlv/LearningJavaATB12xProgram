package Tasks.May_24;

import java.util.Scanner;

//**Task 2 :**
//        Write a Java program that takes a month number (1-12)
//        and prints the number of days in that month using a switch statement. Handle February separately for leap years.
//        a year is a leap year if it is divisible by 4, but not by 100, unless it is also divisible by 400.
//        Input -> 1 to 12, and Year = 2025
//        -> 1 and year 2025 -> 31 Days
//        -> 2 and year 2025 -> 28 Days, ( 2025 leap)
public class Task2_Switch_DaysInAMonth {

    public static void main(String[] args) {
        int year = 0;
        int month = 0;
        boolean leapyear = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid year.");
            return;
        }
        year = sc.nextInt();

        System.out.println("Enter the month number");
        if (!sc.hasNextInt()) {
            System.out.println("please enter integers only ");
            return;
        }
        month = sc.nextInt();

        if (year <= 0) {
            System.out.println("Year must be a positive integer.");
            return;
        }

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("A leap year");
            leapyear = true;
        } else {
            System.out.println("Not a leap year");
        }
        boolean validMonth = (month >= 1 && month <= 12) ? true : false;
        System.out.println("Number of days in a month are ");

        if (validMonth) {
            switch (month) {
                case 2 -> {
                    if (leapyear) {
                        System.out.println(29);
                    } else {
                        System.out.println(28);
                    }
                }
                case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(31);
                case 4, 6, 9, 11 -> System.out.println(30);

            }
        }

    }

}
