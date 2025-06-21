package Tasks.May_25;

import java.util.Scanner;

public class Task1_ReverseNumber {
    public static void main(String[] args) {
        //Reverse the number using for loop. (In - 12345, Out - 54321)
        System.out.println("Enter a number ");
        int num = 0;
        int result = 0;
        Scanner sc = new Scanner(System.in);
        //edge cases
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        //reverse the number
        num = sc.nextInt();
        boolean isNegative=num< 0;
        num=Math.abs(num);       // Work with positive value to reverse
        while (num != 0) {
            int r = num % 10;
            result = (result * 10) + r;
            num = num / 10;
        }
        if(isNegative)
        {
            result=-result;
        }
        System.out.println("Revers number is " + result);
    }
}

