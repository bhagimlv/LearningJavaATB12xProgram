package Tasks.May_25;

import java.util.Scanner;

//
//11. ✅ Grade Calculator:
//        Write a program that calculates and displays the letter grade for
//        a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
//
//        A: 90-100
//
//        B: 80-89
//
//        C: 70-79
//
//        D: 60-69
//
//        F: 0-59
public class Task11_Grade_Calculator {
    public static void main(String[] args) {
        int score;
        Scanner sc = new Scanner(System.in);
        char grade=' ';

        System.out.println("Enter the score of a student ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid value-Non integer value");
            return;
        }
        score = sc.nextInt();
        System.out.print("Grade is ");
        if (score >= 90 && score <= 100) {
            System.out.println("A");
            grade='A';
        } else if (score >= 80 && score <= 89) {
            System.out.println("B");
            grade='B';
        } else if (score >= 70 && score <= 79) {
            System.out.println("C");
            grade='C';
        } else if (score >= 60 && score <= 69) {
            System.out.println("D");
            grade='D';
        } else if (score >= 0 && score <= 59) {
            System.out.println("F");
            grade='F';
        }
        switch (grade)
        {
            case 'A'-> System.out.println("Excellent");
            case 'B'-> System.out.println("Very Good");
            case 'C'-> System.out.println("Good");
            case 'D'-> System.out.println("Needs Improvement");
            case 'F'-> System.out.println("Fail");
            default-> System.out.println("Invalid grade");
        }

    }
}

