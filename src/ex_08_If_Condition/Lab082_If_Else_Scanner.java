package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_If_Else_Scanner {
    public static void main(String[] args) {
            // 2. Scanner Class
        System.out.println("Enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt(); // java.util.InputMismatchException

        if (age > 18){
            System.out.println("Allowed to Vote!");
        }else{
            System.out.println("Not allowed to Vote!");
        }
        //taking input from user
        //cli
        //scanner- popular way
        //bufferreader class -popular way
        //files as input
    }
}
