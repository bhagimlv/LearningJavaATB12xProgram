package ex_02_Java_Basics_part2;

public class Lab020_Constants {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Not a constant value "+a);

        System.out.println("final is the keyword to make the constant values as unchangeable in future");
        System.out.println("static keyword we have to use if the constant is not belongs to object and only to the class");
        System.out.println("Use uppercase letters with underscores for constant names like MAX_USERS ");
        System.out.println("No operations are allowed to the constants which are declared as final");

        final int b = 99;
       //b =11;  // java: cannot assign a value to final variable b
        System.out.println(b);
        //b = b+1;
        System.out.println(b);
        System.out.println(b);

        final float PI = 3.14f;
        final float PI1 = 3.14f;
        final float PI2 = 3.14f;
        final float PI4 = 3.14f;
        final int a1 = 10;

        //PI = 90;
        System.out.println("PI float costant value "+PI);
        System.out.println("PI1 float costant value "+PI1);
        System.out.println("PI2 float costant value "+PI2);
        System.out.println("PI4 float costant value "+PI4);
        System.out.println("a1 int costant value "+a1);
    }
}