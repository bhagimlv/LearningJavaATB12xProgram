package Tasks.June_1;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;
//1. Elements of an Array in Reverse Order.

public class Task1_ArrayElements_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size elements");
        if (!sc.hasNextInt()) {
            System.out.println("Enter only integer to input the size ");
            return;
        }
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Please enter non zero and non negative values");
            return;
        }

        int[] array = new int[size];
        System.out.println("Enter the elements of an array ");
        for (int i = 0; i < size; i++) {
            if (!sc.hasNextInt()) {
                System.out.println("only integers are allowed");
                return;
            }
            array[i] = sc.nextInt();
        }

        System.out.println("printing the array elements ");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }


        System.out.println("Reversing the array elements ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

    }
}
