package Tasks.May_24;

import java.util.Scanner;
//**Task 3 :**
//        Factorial for n = user will enter the n from 0 to Max(int)
public class Task3_Factorials {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        long fact =1;
        if (!sc.hasNextInt()) {
            System.out.println("Invalid number");
            System.exit(0);
        }
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("please enter non Negative number");
            return;
        } else if (num == 0 || num == 1) {

        }
        for (int i = 2; i <=num ; i++) {
            fact=fact*i;
        }
        System.out.println("factorial of a number "+fact);
    }
}
