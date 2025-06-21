package ex_03_Literals;

public class Lab028_DiffTypesof_Literals
{
    public static void main(String[] args) {
        int age = 65; // Decimal System - base wil 10
        // Binary Literal
        int binary_num = 0b1010; // Decimal System - 10
        // Octal base? -> 8
        int octal = 0101;
        // Hexadecimal Literals - 16
        int hex = 0Xface;
        //base 16 color combination are in hex - #28a745

        System.out.println("Decimal system - base wil 10 "+age);
        System.out.println("Binary system - base wil 10 "+binary_num);
        System.out.println("Octal system - base wil 8 "+octal);
        System.out.println("Hexadecimal system - base 16 color combination are in hex "+hex);

    }
}