package Tasks.May_25;

import java.util.Scanner;

//6. Fibonacci Series
public class Task6_FibonacciSeries {
    public static void main(String[] args) {
        // Leap year
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Invalid number");
            System.exit(0);
        }
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("please enter non Negative number");
            return;
        } else if (num == 0) {
            System.out.println("No terms to display");
            return;
        } else if (num == 1) {
            System.out.println("Fibonacci Series: 0");
            return;
        }
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println("Fibonacci series ");
        for (int i = 1; i <= num && a <= num; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
