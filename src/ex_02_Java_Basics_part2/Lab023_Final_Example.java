package ex_02_Java_Basics_part2;

public class Lab023_Final_Example {
    public static void main(String[] args) {
        int local;
        local = 10;
        System.out.println("Local variable "+local);

        final float PI = 3.14f;
        // PI = 3.13f; This is final in nature.
        System.out.println("Final variable is nothing but constant "+PI);
    }
}