package Tasks.May_31;

import java.util.Scanner;
//2. Write a program to reverse a string by using an inbuilt function. -> StringBuffer - reverse()

public class Task2_StringBuffer_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse");
        StringBuilder str=new StringBuilder("JAVA");
        StringBuilder str1=new StringBuilder(str);
        // Edge case: Empty input
        if (str.isEmpty()) {
            System.out.println("Input string is empty. Please enter valid text.");
            return;
        }
        str.reverse();
        System.out.println(str1 +" reversal string is "+str);




    }
}
