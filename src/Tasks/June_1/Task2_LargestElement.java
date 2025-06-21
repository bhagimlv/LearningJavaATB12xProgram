package Tasks.June_1;
import java.util.Arrays;
import java.util.Scanner;
//2. Print the Largest Element in an Array.

public class Task2_LargestElement {
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

        // Print the Largest Element in an Array.
        System.out.println("Largest element in an array");
        int max=array[0];
        for (int i = 0; i < array.length ; i++) {
            if(max<array[i])
            {
                max=array[i];
            }



        }
        System.out.println(max);
    }
}
