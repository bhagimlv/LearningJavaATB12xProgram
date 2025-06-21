package Tasks.May_31;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

//1. Write a program to reverse a string without using inbuilt functions. -> forloop

public class Task1_String_Reversal_forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse");
        String str = sc.nextLine();
        String output = "";
        // Edge case: Empty input
        if (str.isEmpty()) {
            System.out.println("Input string is empty. Please enter valid text.");
            return;
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            output = output + str.charAt(i);

        }
        System.out.println(str +" reversal string is "+output);

    }
}
