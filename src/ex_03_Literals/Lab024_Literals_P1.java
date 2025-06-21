package ex_03_Literals;

import java.sql.SQLOutput;

public class Lab024_Literals_P1
{
    public static void main(String[] args) {
        int age = 65;
        // Literal - Integral

        final float pi = 3.14f;
        //  Literal - float

        final int girl_age = 18;
        //girl_age = 19;

        System.out.println("Literal - Integral "+age);
        System.out.println("Literal - float "+pi);
        System.out.println("Constant Literal - Integral "+girl_age);

    }
}