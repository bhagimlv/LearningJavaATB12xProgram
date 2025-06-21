package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};//100,34
        Arrays.sort(numbers);
        System.out.println("After sorting array elements are ");
        for (int num:numbers
             ) {
            System.out.println(num);
        }

        System.out.println("Maximum element after sorting "+numbers[numbers.length-1]);
        System.out.println("second highest element "+numbers[numbers.length - 2]);
        System.out.println("Third highest element "+numbers[numbers.length - 3]);
        System.out.println("Fourth highest element "+numbers[numbers.length - 4]);
}
}
