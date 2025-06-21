package ex_04_Operators;

public class Lab042_Interview_Concat_Plus {
    public static void main(String[] args) {

        // + -> behave differently with the data type.
        // + -> operator overloading
        // concatenation

        System.out.println("+ operator on strings");
        System.out.println("Concatenation on strings using +");
        String s1 = "Hello";
        String s2 = "Practice";
        System.out.println(s1 + s2); // Joins

        System.out.println("+ operator on integers");
        int a = 10;
        int b = 20;
        System.out.println(a + b); // Math
    }
}
