package ex_04_Operators;

import com.sun.security.jgss.GSSUtil;

public class Lab040_Relational_Operators {
    public static void main(String[] args) {
        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        int a = 10;
        int b = 30;
        boolean c = a > b; // // 10> 30
        System.out.println(c);
        int age1 = 33;
        int age2 = 34;
        boolean result = age1 >= age2;
        System.out.println(result);

        // All of them will result boolean output.
        System.out.println("-----------------------------------");
        System.out.println("Relational operators in java will result boolean value");
        System.out.println("< Less Than");
        System.out.println(age1 < age2);
        System.out.println(" < =  -> Less than or equal to");
        System.out.println(age1 <= age2);
        System.out.println("> Greater");
        System.out.println(age1 > age2);
        System.out.println("> = Greater or equal to");
        System.out.println(age1 >= age2);
        System.out.println("== ->  Equal to (but checking)");
        System.out.println(age1 == age2);
        System.out.println("!= -> Not equal");
        System.out.println(age1 !=age2);

    }
}
