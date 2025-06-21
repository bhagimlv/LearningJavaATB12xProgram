package ex_02_Java_Basics_part2;

public class Lab017_Numerics_Datatype {
    public static  void main(String args[])
    {
        //byte b = 128; // -128 to 127
        byte b = 10;
        int i = 10;
        short s = 10;
        char c  = 'A';
        long l = 9876543210l;
        long l1 = 9876543210L;

        float f = 3.14f;
        float f1 = 3.14F;

        double d = 3.123454345343;

        System.out.println("Numeric data types in Java ");
        System.out.println("byte data type 1 byte (8 bits)  "+b);
        System.out.println("short data type 2 bytes (16 bits) "+s);
        System.out.println("int data type 4 bytes (32 bits) "+i);

        System.out.println("long data type with small l at end  8 bytes (64 bits) "+l);
        System.out.println("long data type with capital L  at end 8 bytes (64 bits)  "+l1);

        System.out.println("float data type with small f  at end 4 bytes (32 bits) "+f);
        System.out.println("float data type with capital F  at end 4 bytes (32 bits) "+f1);

        System.out.println("double data type 8 bytes (64 bits) "+d);

        System.out.println("char data type 2 bytes (16 bits) "+c);
    }
}
