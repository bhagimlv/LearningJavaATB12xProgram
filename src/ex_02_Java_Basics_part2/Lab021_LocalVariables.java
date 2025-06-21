package ex_02_Java_Basics_part2;

public class Lab021_LocalVariables {
    public static void main(String[] args) {
        int a = 10;
        byte b = 10;
        short s = 10;
        long l = 9876543210L;
        float f = 3.14F;
        double d = 67.8987654567;
        boolean b1 = true;
        char c = 'A';

        System.out.println("Local variables are accessed in the local block and also to the method block");
        System.out.println("Local variables in the main method");
        System.out.println("        int a = 10 " + a);
        System.out.println("     byte b = 10 " + b);
        System.out.println("     short s = 10  " + s);
        System.out.println("        long l = 9876543210L " + l);
        System.out.println("  float f = 3.14F " + f);
        System.out.println("       double d = 67.8987654567 " + d);
        System.out.println("    boolean b1 = true " + b1);
        System.out.println("        char c = 'A' " + c);

    }
}