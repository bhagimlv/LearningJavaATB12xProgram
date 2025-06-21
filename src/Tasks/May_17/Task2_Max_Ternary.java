package Tasks.May_17;

import java.util.Scanner;
//**Task 2:**
//        Use the ternary operator, nested ternary operator.
//        If we have three numbers, N1, N2, and N3, give me the maximum between the three numbers.
public class Task2_Max_Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        if(!sc.hasNextInt())
        {
            System.out.println("Enter only integer numbers ");
            return;
        }
        int n1=sc.nextInt();
        if(!sc.hasNextInt())
        {
            System.out.println("Enter only integer numbers ");
            return;
        }
        int n2=sc.nextInt();
        if(!sc.hasNextInt())
        {
            System.out.println("Enter only integer numbers ");
            return;
        }
        int n3=sc.nextInt();

        int max= n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3);
        System.out.println("Maximum number is "+max);
    }
}
