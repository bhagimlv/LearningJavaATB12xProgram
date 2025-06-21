package Tasks.May_25;

import java.util.Scanner;

//9. Armstrong Number.
public class Task9_ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        int num = 0;
        int result = 0;
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Enter only numbers ");
            System.exit(0);
        }
        num = sc.nextInt();
        num = Math.abs(num);
        //reverse the number
        while (num != 0) {
            int r = num % 10;
            result = result + (r * r * r);
            num = num / 10;
        }
        System.out.println("Result is " + result);
        if (num == result) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}
