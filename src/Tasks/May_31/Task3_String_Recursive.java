package Tasks.May_31;

import java.util.Scanner;
//3. Write a program to reverse a string without using a loop without using an inbuilt function. -> recursive functions

public class Task3_String_Recursive {
    public static String reverseString(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
        //tracing for bhagya - reverseString(str.sbustring(hagya))+b -result
        //first time    - reverseString(str.sbustring(hagya))+b -aygahb
        //second time   - reverseString(str.sbustring(agya))+h -aygah
        //third time   - reverseString(str.sbustring(gya))+a - ayga
        //fourth time   - reverseString(str.sbustring(ya))+g -ayg
        //fifth time   - reverseString(str.sbustring(a))+y - ay
        //downside calculate the result and go upside
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String input = sc.nextLine();

        // Edge case: empty string
        if (input.isEmpty()) {
            System.out.println("Input string is empty.");
        } else {
            String reversed = reverseString(input);
            System.out.println("Reversed string: " + reversed);
        }
    }
}

