package Tasks.May_31;

import java.util.Scanner;
//6. First Letter of Each Word in a String

public class Task6_FirstLetter_EachWord_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to know whether its a palindrome or not  ");
        String input =sc.nextLine();
        // Edge case: empty string
        if (input.isEmpty()) {
            System.out.println("Input string is empty.");
            return;
        }
        System.out.println("Input string " + input);

        String []strArray=input.trim().split("\\s+");
        for (int i = 0; i < strArray.length ; i++) {
            System.out.print(strArray[i].charAt(0)+" ");
        }

    }
}

