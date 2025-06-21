package ex_02_Java_Basics_part2;

public class DefaultValuesPrimitveDatatypes {
    //primitive data types
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char ch;
    boolean bl;
    //non primitive data types
    String str;

    public void printDefaults() {
        System.out.println("byte " + b);     // 0
        System.out.println("short " + s);    // 0
        System.out.println("int  " + i);     // 0
        System.out.println("long " + l);     // 0
        System.out.println("float " + f);    // 0.0
        System.out.println("double " + d);   // 0.0
        System.out.println("char [" + ch + "]"); // (empty char)
        System.out.println("boolean " + bl); // false
        System.out.println("String " + str); // null
    }

    public static void main(String[] args) {

        new DefaultValuesPrimitveDatatypes().printDefaults();


    }
}
