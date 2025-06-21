package Tasks.May_17;

import java.util.Scanner;

public class Task1_Ternary_Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        if (!sc.hasNextInt()) {
            System.out.println("Please enter the integers only");
            return;
        }
        int num = sc.nextInt();
        if(num<=0)
        {
            System.out.println("Enter only postive numbers other than zero");
            return;

        }
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
