package Tasks.May_31;

import java.util.Scanner;
//4. Count the Number of Words in a String (replaceAll)

public class Task5_StringPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to know whether its a palindrome or not  ");
        StringBuilder input = new StringBuilder(sc.nextLine());
        // Edge case: empty string
        if (input.isEmpty()) {
            System.out.println("Input string is empty.");
            return;
        }
        System.out.println("Input string " + input);
        StringBuilder reverse = new StringBuilder(input).reverse();
        System.out.println("Reverse string " + input);

        if (input.toString().equalsIgnoreCase(reverse.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}

