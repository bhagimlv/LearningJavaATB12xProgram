package ex_02_Java_Basics_part2;

public class Lab018_Byte_Datatype {
    public static void main(String[] args) {
        byte age = 10;
        System.out.println("age value from main method "+age);
        main(20);

    }
    public static void main(int args) {
        byte age = 11;
        System.out.println("age value from another main method "+age);
        System.out.println("args value from another main method "+args);
       // 1 byte (8 bits)
    }

}
