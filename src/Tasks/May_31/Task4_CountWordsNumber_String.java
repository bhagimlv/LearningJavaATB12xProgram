package Tasks.May_31;

import java.util.Scanner;
//4. Count the Number of Words in a String (replaceAll)

public class Task4_CountWordsNumber_String{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String input = sc.nextLine();

        // Edge case: empty string
        if (input.isEmpty()) {
            System.out.println("Input string is empty.");
            return;
        }

            // Remove extra spaces using replaceAll()
            input = input.trim().replaceAll("\\s+", " ");
            System.out.println("input after removing replace all extra spaces with normal spaces  "+input);
            //spliting with the normal spaces after removing extra spaces
            String []strArray=input.split("\\s");
            System.out.println(strArray.length);

    }
}

