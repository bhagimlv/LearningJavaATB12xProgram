package ex_04_Operators;

public class Lab041_Logical_Operators {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("Logical operators in java will result boolean value");
        System.out.println("-----------------------------------------");
        System.out.println("Logical And");
        boolean c1= false && true;
        System.out.println(c1);

        System.out.println("Logical or");
        boolean c= true || false;
        System.out.println(c);

        System.out.println("Logical not ");
        boolean a = true;
        System.out.println(!a);

        System.out.println("Logical not applied two times");
        boolean b = true;
        System.out.println(!!b);

    }
}
