package Tasks.June_1;

import java.util.Scanner;

//6. Sir, pls help me with a array program arr=[2,3,0,5,0,1] ,
//        how can we extract zeros from this array and add them at the end. (without using inbuilt function)
public class Task6_ExtractZeros {
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
            System.out.print(array[i]);
        }
        System.out.println("\n________");
        // [2,3,0,5,0,1]
        int index = 0; // To track position for non-zero elements

        // Step 1: Move non-zero elements forward and count the non zero elements that is index
        for (int i = 0; i < size; i++) {
            if (array[i] != 0) {
                array[index] = array[i];
                index++;
            }
        }

        // Step 2: Fill remaining array with zeros
        while (index < size) {
            array[index] = 0;
            index++;
        }
        for (int num : array) {
            System.out.print(num + " ");
        }

    }
}
