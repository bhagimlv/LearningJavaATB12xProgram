package Tasks.June_1;

import java.util.Scanner;

//5. Odd and Even Numbers from an Array
public class Task5_ArrayEven_odd_Numbers {
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

//        5. Odd and Even Numbers from an Array
        System.out.println("Even Numbers from an Array");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println(array[i]);
            }
        }
        System.out.println("odd Numbers from an Array");
        for (int i = 0; i < array.length; i++) {
            if (!(i % 2 == 0) ){
                System.out.println(array[i]);
            }
        }

    }
}
