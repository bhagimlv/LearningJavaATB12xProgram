package ex_16_Arrays;

import java.util.Scanner;

public class Lab_pyramid_pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num e.g = 3");
        int n = scanner.nextInt();

        for (int i = 0; i <n ; i++) { //rows iteration
            for (int j = n-i-1; j>=1 ; j--) { //priting the no of spaces
                System.out.print(" ");
            }
            for (int k = 0; k <=i ; k++) {//printing the stars
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------");

        //logic has to change here
        for (int i = 0; i <n ; i++) { //rows iteration
            for (int j = n-i-1; j>=1 ; j--) { //priting the no of spaces
                System.out.print("* ");

            }
            for (int k = 0; k <=i ; k++) {//printing the stars
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("____________________");

        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k < (n - i) - 1; k++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }

    }
}
