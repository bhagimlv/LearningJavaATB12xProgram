package Tasks.May_25;
//4. Prime Number

import java.util.Scanner;

public class Task4_PrimeNumber {
    public static void main(String[] args) {
        // Prime Number
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);

        boolean isPrime = true;
        if (!sc.hasNextInt()) {
            System.out.println("only enter integer numbers ");
            return;
        }
        int num = sc.nextInt();
        //edge cases added
        if(num<=1)
        {
            System.out.println("Not a prime number ");
            return;
        }


        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("A prime number");

        } else {
            System.out.println("Not a prime number ");
        }


    }
}
