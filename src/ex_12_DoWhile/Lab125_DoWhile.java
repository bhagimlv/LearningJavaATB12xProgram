package ex_12_DoWhile;

import java.sql.SQLOutput;

public class Lab125_DoWhile {
    public static void main(String[] args) {
        System.out.println("Do while loop follows ICU");
        System.out.println("loop will execute oen time even the condition failed");
        int a = 1;
        do {
            System.out.println("Body!");
            System.out.println(a);
            a++;
        } while (a < 10);
    }
}
