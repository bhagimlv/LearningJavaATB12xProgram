package Tasks.May_18;

import java.util.Scanner;

//Write a program that classifies a triangle based on its side lengths.
//        Given three input values representing the lengths of the sides, determine if the triangle is
//        equilateral (all sides are equal), isosceles (exactly two sides are equal),
//        or scalene (no sides are equal). Use an if-else statement to classify the triangle
//        n1,n2,n3 → iso,eq,sc

// Reason: Triangle Inequality Theorem
//         For any three sides to form a triangle,
//         the sum of the lengths of any two sides must be greater than the third side.


public class Task1_Triangle_Classifier {

    public static void main(String[] args) {

        int n1,n2,n3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three sides of triagnle to classify");
        // Input validation for three integers
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter integers only.");
            return;
        }
        n1 = sc.nextInt();

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter integers only.");
            return;
        }
        n2 = sc.nextInt();

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter integers only.");
            return;
        }
        n3 = sc.nextInt();

        if (n1 <= 0 || n2 <= 0 || n3 <= 0) {
            System.out.println("Side lengths must be positive");
            return;
        }

        if(n1+n2>n3 && n2+n3>n1 && n1+n3>n2) {
            System.out.println("Triangle can be formed");
            if (n1 == n2 && n2 == n3) {
                System.out.println("Equilateral traingle");

            } else if (n1 == n2 || n2 == n3 || n3 == n1) {
                System.out.println("isosceles traingle");
            } else {
                System.out.println("Scalene triangle");
            }
        }
        else
        {
            System.out.println("Triangle can not be performed");
        }


    }
}
