package ex_05_TypeCasting;

public class Lab057_TypeCasting_0 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b;
        // Valid syntax -> smaller data into the bigger data type
        // Implicit - Casting - Widening
        System.out.println("TypeCasting small datatype can be easily converted to large datatype");
        System.out.println("small to large is called implicit cast and widening");
        System.out.println("byte data type "+b);
        System.out.println("implicit converted b to int "+a);

        //large to small
        long l = 78;
        short s = (short) l;
        System.out.println("TypeCasting large datatype can be converted to small datatype using explicit type mention");
        System.out.println("large to small  is called explicit cast and narrowing");
        System.out.println("long data type  "+l);
        System.out.println("explicit converted l to short "+s);
    }
}
