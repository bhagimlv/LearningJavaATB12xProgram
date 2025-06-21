package Tasks.May_25;

//5. Leap year.
import java.util.Scanner;

public class Task5_Leapyear {
    public static void main(String[] args) {
        // Leap year
        System.out.println("Enter a year ");
        Scanner sc = new Scanner(System.in);


        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid year.");
            return;
        }

        int year = sc.nextInt();

        if (year <= 0) {
            System.out.println("Year must be a positive integer.");
            return;
        }

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("A leap year");
        } else {
            System.out.println("Not a leap year");
        }




    }
}
