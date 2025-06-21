package Tasks.May_11;

import java.util.Scanner;

//Table of 5 you need to print,  (only use the printF)
//        int num = 5;
//
//        5×1=5
//        5×2 = 10
//        ….
//        5×10 =50

public class Task1_Print_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        if(!sc.hasNextInt())
        {
            System.out.println("Enter only integer values");
            return;
        }
        int num=sc.nextInt();
        if(num<=0)
        {
            System.out.println("Enter non zero positive values");
            return;
        }
        for(int i=1;i<=10;i++)
        {
            System.out.println(num + " * "+i+ " = "+(num*i));
        }


    }
}
